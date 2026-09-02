class Solution {
    String formatString(String s){
        s = s.toLowerCase();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            if ((s.charAt(i) >= 97 && s.charAt(i) <= 127) || (s.charAt(i) >= 48 && s.charAt(i) <= 57)){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public boolean isPalindrome(String s) {
        String formatted_s = formatString(s);
        int n = formatted_s.length();
        int left = 0;
        int right = n - 1;
        while (left < right){
            if (formatted_s.charAt(left++) != formatted_s.charAt(right--)) return false;
        }
        return true;
    }
}
