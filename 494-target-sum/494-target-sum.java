class Solution {
    static int count = 0;
    
    public void findCount(int[] nums, int target, int idx, int currSum){
        // base case 
        if(idx == nums.length){
            if(currSum == target){
                count++;
            }
                
            return;
        }
        
        // first take the positive value of number
        currSum = currSum + nums[idx];
        findCount(nums, target, idx+1, currSum);
        
        // remove the num value from sum
        currSum = currSum - nums[idx];
        
        // now try with the negative value of number
        currSum = currSum + (-1 * nums[idx]);
        findCount(nums, target, idx+1, currSum);
    }
    
    public int findTargetSumWays(int[] nums, int target) {
        count = 0;
        findCount(nums, target, 0, 0);
        int result = count;
        return result;
    }
}