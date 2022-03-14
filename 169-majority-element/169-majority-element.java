// Borye - Moore Majority Voting Algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = -1;
        
        // finding majority
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                candidate = nums[i];
                count = 1;
            }else{
                if(candidate == nums[i])
                    count++;
                else
                    count--;
            }
        }
        
        // getting total count of majority
        count = 0;
        for(int i=0; i<nums.length; i++)
            if(nums[i] == candidate)
                count++;
        
        // checking if count is greater than N/2
        if(count > nums.length/2)
            return candidate;
        
        return -1;
    }
}