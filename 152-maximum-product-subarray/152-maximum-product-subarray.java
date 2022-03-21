class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int minProd = nums[0];
        int maxProd = nums[0];
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] < 0){
                // swap values of maxProd and minProd
                int temp = minProd;
                minProd = maxProd;
                maxProd = temp;
            }
            
            minProd = Math.min(nums[i], nums[i]*minProd);
            maxProd = Math.max(nums[i], nums[i]*maxProd);
            
            if(ans < maxProd)
                ans = maxProd;
        }
        
        return ans;
    }
}