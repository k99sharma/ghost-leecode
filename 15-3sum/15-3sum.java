class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort the arrays
        Arrays.sort(nums);
        
        List<List<Integer>> result = new LinkedList<> ();
        
        // a + b + c = 0;
        // lets make a constant so b+c = -a
        // now sum = b+c where a is constant 
        // we can find sum using 2 pointers approach
        
        for(int i=0; i<nums.length-2; i++){
            // avoiding dupliates using this condition 
            if(i == 0 || (i>0 && nums[i-1] != nums[i])){
                int lo = i+1;
                int hi = nums.length-1;
                int sum = 0 - nums[i];
                
                while(lo < hi){
                    if(nums[lo]+nums[hi] == sum){
                        // store it in result
                        result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        
                        while((lo < hi) && nums[lo] == nums[lo+1])lo++; // avoiding duplicates
                        while((lo < hi) && nums[hi] == nums[hi-1])hi--; // avoiding duplicates
                        
                        lo++;
                        hi--;
                    }
                    else if((nums[lo]+nums[hi]) < sum)
                        lo++;
                    else
                        hi--;
                }
            }
        }
        
        return result;
    }
}