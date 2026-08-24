class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars_s = s.toCharArray();
        Arrays.sort(chars_s);
        s = new String(chars_s);

        char[] chars_t = t.toCharArray();
        Arrays.sort(chars_t);
        t = new String(chars_t);

        if (s.equals(t)){
            return true;
        } else {
            return false;
        }
    }
}