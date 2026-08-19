class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int start=1,end=1;
        int ans=0;
        int hrs=0;
        for(int i=0;i<n;i++){
            end=Math.max(end,piles[i]);
        }
        while(start<=end){
            int guess=start+(end-start)/2;
            hrs=0;
            for(int i=0;i<n;i++){
                 hrs+=piles[i]/guess;
                if(piles[i]%guess!=0){
                    hrs++;
                }
            }
            if(hrs>h){
                start=guess+1;
            }
            else{
                ans=guess;
                end=guess-1;
            }
        }
        return ans;
    }
}
