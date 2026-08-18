class Solution {
    public int mySqrt(int x) {
        int low=0;
        int high=x;
        int ans=1;
        while(low<=high){
            int guess=low+(high-low)/2;
            if((long)guess*guess == x){
                return guess;
            }
            else if((long)guess*guess > x){
                high=guess-1;
            }
            else{
                ans=Math.max(ans,guess);
                low=guess+1;
            }
        }
        return ans;
    }
}