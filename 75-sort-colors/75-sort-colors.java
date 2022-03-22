class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        
        // counting occurances
        for(int x : nums){
            count[x] += 1;
        }

        int counter = 0;
        // putting values back in-place
        for(int i=0; i<3; i++){
            int numCount = count[i];
            for(int j=0; j<numCount; j++){
                nums[counter] = i;
                counter++;
            }            
        }
    }
}