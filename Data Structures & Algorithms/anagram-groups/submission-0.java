class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> tbr = new ArrayList<List<String>>();
        int n = strs.length;
        Map<String, List<String>> myMap = new HashMap<>();
        for (int i = 0; i < n; i++){
            String s = strs[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!myMap.containsKey(key)){
                myMap.put(key, new ArrayList<>());
            }
            myMap.get(key).add(s);
        }
        return new ArrayList<>(myMap.values());
    }
}