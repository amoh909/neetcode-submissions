class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> MySet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (MySet.contains(nums[i])){
                return true;
            } else {
                MySet.add(nums[i]);
            }
        }
        return false;
    }
}