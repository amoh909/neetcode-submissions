class Solution {
    int[] lengths;
    int n;

    public String encode(List<String> strs) {
        n = strs.size();
        lengths = new int[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            lengths[i] = strs.get(i).length();
            sb.append(strs.get(i));
            sb.append(lengths[i] + "");
        }
        String encoded_string = sb + "";
        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int offset = 0;
        for (int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < lengths[i]; j++){
                sb.append(str.charAt(j + offset));
            }
            decoded_strs.add(sb + "");
            offset += lengths[i] + (lengths[i]+"").length();
        }
        return decoded_strs;
    }
}
