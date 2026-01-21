class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();

        for(int s:nums){
            if(set.contains(s)) return true;//which menas we found diplicates
            set.add(s);

        }
        return false;// only unique elements

        
    }
}