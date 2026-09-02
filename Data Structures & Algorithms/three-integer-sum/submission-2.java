class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                while (i < nums.length && nums[i] == nums[i - 1]) i++;
            }
            if (i == nums.length)
                break;
            int n = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == 0 - n) {
                    List<Integer> curr = new ArrayList<>();
                    curr.add(n);
                    curr.add(nums[left]);
                    curr.add(nums[right]);
                    ans.add(curr);
                    int currentLeft = nums[left];
                    int currentRight = nums[right];
                    while (left < right && nums[left] == currentLeft) left++;
                    while (left < right && nums[right] == currentRight) right--;

                } else if (nums[left] + nums[right] < 0 - n) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}
