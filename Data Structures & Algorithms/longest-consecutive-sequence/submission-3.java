class Solution {
    public Set<Integer> mySet;
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        mySet = new HashSet<Integer>();
        int ans = 0;
        for (int num : nums){
            mySet.add(num);
        }
        for (int num : mySet){
            if (!mySet.contains(num - 1)){
                int length = 1;
                while (mySet.contains(num + length)) length++;
                ans = Math.max(ans, length);
            }    
        }
        return ans;
    }
}
