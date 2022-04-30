class Solution {
    public int minimumAverageDifference(int[] nums) {
        if(nums.length == 1)
            return 0;
        
        // find the whole array sum
        long totalSum = 0;
        for(int x : nums)
            totalSum += x;
        
        int minIndex = Integer.MAX_VALUE;
        long diff = Integer.MAX_VALUE;
        long prefixSum = 0;
        long suffixSum = 0;
        
        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];
            suffixSum = totalSum - prefixSum;
            
            long prefixAvg = Math.round(prefixSum/(i+1));
            long suffixAvg = i < nums.length-1 ?  Math.round(suffixSum/(nums.length-i-1)) : 0;
            
            long currDiff = Math.abs(prefixAvg - suffixAvg);
            
            if(currDiff < diff){
                diff = currDiff;
                minIndex = i;
            }else if(currDiff == diff){
                minIndex = Math.min(minIndex, i);
            }
        }
        
        return minIndex;
    }
}