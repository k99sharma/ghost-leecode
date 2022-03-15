class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int x : nums){
            sum += x;
            
            max_so_far = Math.max(sum, max_so_far);
            
            if(sum <= 0)
                sum = 0;
        }
        
        return max_so_far;
    }
}