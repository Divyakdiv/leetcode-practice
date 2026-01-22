class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        int pos = 0;

        for(int i=0; i<n; i++){
            if(nums[i]== target){
                return pos=i;
            }
        }
        return -1;
    }
}