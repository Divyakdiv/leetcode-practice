class Solution {
    public List<Integer> intersection(int[][] nums) {
        
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        int rows = nums.length;

        for(int i =0; i<rows; i++){
            for(int val: nums[i]){
                if(freq.containsKey(val)){
                freq.put(val, freq.get(val)+1);
                }
                else{
                freq.put(val, 1);
                }
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> e : freq.entrySet())
        if(e.getValue()==rows){
            ans.add(e.getKey());
        }

        Collections.sort(ans);
        return ans;
    }
}