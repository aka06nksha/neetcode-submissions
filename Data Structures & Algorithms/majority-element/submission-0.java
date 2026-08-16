class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int n=nums.length;
        int cnt=(n/2)+1;
        for(int i=0;i<n;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        for(int i:hmap.keySet()){
            if(hmap.get(i)>=cnt){
                return i;
            }
        }
        return -1;
    }
}