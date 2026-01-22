class Solution {
    public int dominantIndex(int[] nums) {

        int max=nums[0];
        int inx=0;

        for(int i=1; i<nums.length; i++){
            if(nums[i]>max){
               max= nums[i];
               inx=i;
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(i==inx) continue;
            if(max<2*nums[i]) return -1;
        }

        return inx;
    }
}
