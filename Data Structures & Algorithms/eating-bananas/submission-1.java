class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        int n = piles.length;
        for (int i = 1; i < n; i++){
            max = Math.max(max, piles[i]);
        }
        int right = max;
        int left = 1;
        int ans = max;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int temp_h = h;
            for (int i = 0; i < n; i++){
                temp_h -= Math.ceilDiv(piles[i], mid);
            }
            if (temp_h >= 0){
                ans = Math.min(ans, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
