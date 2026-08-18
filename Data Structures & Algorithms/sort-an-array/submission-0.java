class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        mergesort(nums,0,n-1);
        return nums;
    }
    public void mergesort(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
         int mid=(low+high)/2;
         mergesort(nums,low,mid);
         mergesort(nums,mid+1,high);
         merge(nums,low,mid,high);
    }
    public void merge(int[] nums, int low, int mid, int high){
        ArrayList<Integer> temp=new ArrayList<>();
         int i=low,j=mid+1;
         while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                temp.add(nums[i]);
                i++;
            }
            else{
                temp.add(nums[j]);
                j++;
            }
         }
         while(i<=mid){
            temp.add(nums[i]);
            i++;
         }
         while(j<=high){
            temp.add(nums[j]);
            j++;
         }
         for(int a=0;a<temp.size();a++){
            nums[low+a]=temp.get(a);
         }
    }
}