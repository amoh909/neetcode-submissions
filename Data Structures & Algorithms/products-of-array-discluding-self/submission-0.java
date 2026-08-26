class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftprefix = new int[nums.length];
        int[] rightprefix = new int[nums.length];

        leftprefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            leftprefix[i] = leftprefix[i-1] * nums[i];
        }

        rightprefix[rightprefix.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--){
            rightprefix[i] = rightprefix[i + 1] * nums[i];
        }

        int[] tbr = new int[nums.length];

        tbr[0] = rightprefix[1];
        for (int i = 1; i < nums.length - 1; i++){
            tbr[i] = leftprefix[i - 1] * rightprefix[i + 1];
        }
        tbr[tbr.length - 1] = leftprefix[tbr.length - 2];
        return tbr;
    }
}