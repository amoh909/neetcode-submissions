class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n - 1;
        int max = Math.min(heights[left], heights[right]) * (right - left);
        while (left < right) {
            if (heights[left] < heights[right]) {
                left++;
            } else if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
                right--;
            }
            max = Math.max(max, Math.min(heights[left], heights[right]) * (right - left));
        }
        return max;
    }
}
