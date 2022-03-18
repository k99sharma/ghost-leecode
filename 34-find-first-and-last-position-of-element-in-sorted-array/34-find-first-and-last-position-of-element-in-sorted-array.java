class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        Arrays.fill(result, -1);
        
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(nums[mid] == target){
                // default position of target
                Arrays.fill(result, mid);
                
                // checking for starting position
                int i = mid;
                while(i >= 0 && nums[i] == target)i--;
                result[0] = i+1;
                
                // checking for ending position
                i = mid;
                while(i < nums.length && nums[i] == target)i++;
                result[1] = i-1;
                
                break;
            }
            else if(nums[mid] > target)
                end = mid-1;
            else
                start = mid+1;
        }
        
        return result;
    }
}