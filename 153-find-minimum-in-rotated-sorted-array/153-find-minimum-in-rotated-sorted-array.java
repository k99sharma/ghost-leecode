class Solution {
    public int findMin(int[] nums) {
        // if nums is empty
        if(nums.length == 0) return -1;
        
        // if nums length is 1
        if(nums.length == 1) return nums[0];
        
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            
            // finding the point where nums[mid-1] > nums[mid] ---> nums[mid] will be smaller 
            if(mid > 0 && nums[mid] < nums[mid-1])
                return nums[mid];
            
            else if(nums[start] <= nums[mid] && nums[mid] > nums[end])
                start = mid+1;
            
            else
                end = mid-1;
        }
        
        return nums[start];
    }
}