class Solution {
    public int findCount(int[] nums, int target, int idx, int sum){
        if(idx == nums.length){
            if(sum == target)
                return 1;
            
            return 0;
        }   
        
        return findCount(nums, target, idx+1, sum + nums[idx]) + findCount(nums, target, idx+1, sum-nums[idx]);
    }
    
    public int findTargetSumWays(int[] nums, int target) {
        return findCount(nums, target, 0, 0);
    }
}