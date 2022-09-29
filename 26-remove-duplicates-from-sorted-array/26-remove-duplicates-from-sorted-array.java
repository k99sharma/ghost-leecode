class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int i = 0;
        int j = 0;
        
        while(j < nums.length){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
                count++;
            }
            
            j++;
        }
        
        return count;
    }
}