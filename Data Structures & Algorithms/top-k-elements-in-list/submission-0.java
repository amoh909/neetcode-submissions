class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[k];
        Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
        List<Integer>[] buckets = new List[n + 1];
        for (int i = 0; i < n + 1; i++){
            buckets[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++){
            myMap.merge(nums[i], 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }
        int index = 0;
        for (int i = n; i >= 0; i--){
            for (int nb : buckets[i]){
                ans[index++] = nb;
                if (index == k) return ans;
            }
        }
        return ans;
    }
}