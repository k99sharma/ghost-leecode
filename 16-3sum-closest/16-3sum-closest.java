class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // arrays sort
        Arrays.sort(nums);
        
        int result = 0;
        int minDiff = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length-2; i++){
            int lo = i+1;
            int hi = nums.length-1;
            
            while(lo < hi){
                int sum = nums[i] + nums[lo] + nums[hi];
                
                if(Math.abs(target-sum) < minDiff){
                    minDiff = Math.abs(target-sum);
                    result = sum;
                }
                
                else if(sum == target)
                    return sum;
                else if(sum > target)hi--;
                else lo++;
            }
        }
        
        return result;
    }
}