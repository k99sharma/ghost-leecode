class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // brute force approach
        int minDiff = Integer.MAX_VALUE;
        int result = 0;
        
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    if(sum == target)
                        return sum;
                    
                    else if(Math.abs(sum-target) < minDiff){
                        minDiff = Math.abs(sum-target);
                        result = sum;
                    }
                }
            }
        }
        
        return result;
    }
}