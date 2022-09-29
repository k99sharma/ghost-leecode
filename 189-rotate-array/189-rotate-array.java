class Solution {
    public static void rotate(int[] nums, int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        // if(k > nums.length){
        //     rotate(nums, 0, nums.length-1);
        //     return;
        // }
        k = k%nums.length;
        
        rotate(nums, 0, nums.length-k-1);
        rotate(nums, nums.length-k, nums.length-1);
        rotate(nums, 0, nums.length-1);
    }
}