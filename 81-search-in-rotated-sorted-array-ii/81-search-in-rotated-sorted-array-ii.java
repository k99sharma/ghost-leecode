class Solution {
    public boolean binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(nums[mid] == target)
                return true;
            else if(nums[mid] > target)
                end = mid-1;
            else 
                start = mid+1;
        }
        
        return false;
    }
    
    public boolean search(int[] nums, int target) {
        if(nums.length == 0)
            return false;
        
        if(nums.length == 1) 
            return (nums[0] == target) ? true : false;
        
        // find rotated points
        int maxPoint = -1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                maxPoint = i;
                break;
            }
        }
        
        if(maxPoint == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
                
        int start =0, end = 0;
        
        if(target == nums[maxPoint])
            return true;
        
        else if(target < nums[0]){
            start = maxPoint+1;
            end = nums.length-1;
        }else{
            start = 0;
            end = maxPoint;
        }

        boolean result = binarySearch(nums, target, start, end);
        
        return result;
        
    }
}