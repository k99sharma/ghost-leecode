class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int x : nums){
            sum += x;
            
            max = Math.max(sum, max);
            
            if(sum <= 0)
                sum = 0;
        }
        
        return max;
    }
}