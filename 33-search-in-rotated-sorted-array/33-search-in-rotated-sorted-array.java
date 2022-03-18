class Solution {
    public int search(int[] nums, int target) {
        // if nums is empty
        if(nums.length == 0)
            return -1;
        
        int start = 0;
        int end = nums.length-1;
        int pivot = nums[0];
        
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(nums[start] == target)
                return start;
            
            else if(nums[end] == target)
                return end;
            
            else if(nums[mid] == target)
                return mid;
            
            else if(target > nums[mid]) end--;
            else start++;
        }
        
        return -1;
    }
}