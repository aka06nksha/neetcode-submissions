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
        int low=1;
        int high=n;
        while(low<=high){
            int guess=low+(high-low)/2;
              if(guess(guess)==0){
               return guess;
              }
              else if(guess(guess)==-1){
                 high=guess-1;
              }
              else{
                low=guess+1;
              }
        }
        return -1;
    }
}