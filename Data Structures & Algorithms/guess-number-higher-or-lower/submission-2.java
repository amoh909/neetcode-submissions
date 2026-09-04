/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high){
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            if (guess(mid1) == 0){
                return mid1;
            } else if (guess(mid2) == 0){
                return mid2;
            } 

            if (guess(mid1) == -1){
                high = mid1 - 1;
            } else if (guess(mid2) == 1){
                low = mid2 + 1;
            } else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }
        return 1;
    }
}