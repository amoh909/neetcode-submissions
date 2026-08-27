class Solution {

    public String encode(List<String> strs) {
        int n = strs.size();
        if (strs.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for (String s : strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0) return new ArrayList<>();
        int n = str.length();
        List<String> decoded_strs = new ArrayList<>();
        int start = 0;
        while (start < n){
            int end = start;
            while (str.charAt(end) != '#'){
                end++;
            }
            int size = Integer.parseInt(str.substring(start, end));
            start = end + 1;
            decoded_strs.add(str.substring(start, start + size));
            start += size;
        }
        return decoded_strs;
    }
}
