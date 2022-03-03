class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<> ();
        
        // iterating over nums
        for(int i=0; i<nums.length; i++){
            int curr_diff = target - nums[i];
            
            if(hm.containsKey(curr_diff)){
                int[] result = {hm.get(curr_diff), i};
                return result;
            }
            
            hm.put(nums[i], i);
        }
        
        return null;
    }
}