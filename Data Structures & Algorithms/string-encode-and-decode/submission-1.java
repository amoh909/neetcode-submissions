class Solution {

    public String encode(List<String> strs) {
        int n = strs.size();
        if (strs.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sizes.add(strs.get(i).length());
        }
        for (int size : sizes){
            sb.append(size).append(',');
        }
        sb.append('#');
        for (String str : strs){
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0) return new ArrayList<>();
        int n = str.length();
        List<String> decoded_strs = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int index = 0;
        while (str.charAt(index) != '#'){
            StringBuilder size = new StringBuilder();
                while (str.charAt(index) != ','){
                    size.append(str.charAt(index++));
                }
                sizes.add(Integer.parseInt(size.toString()));
                index++;
            }
        index++;
        for (int size : sizes){
            decoded_strs.add(str.substring(index, index + size));
            index += size;
        }
        return decoded_strs;
    }
}
