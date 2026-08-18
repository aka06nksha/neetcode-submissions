class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low=0,high=n-1;
        while(low<=high){
            int guess=(low+high)/2;
            if(nums[guess]==target){
                return guess;
            }
            else if(nums[guess]>target){
                 high=guess-1;
            }
            else{
                low=guess+1;
            }
        }
        return low;
    }
}