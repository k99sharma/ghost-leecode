class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<> ();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int low = i+1;
            int high = nums.length-1;
            int sum = 0 - nums[i];
            
            while(low < high){
                if((nums[low]+nums[high]) == sum){
                    List<Integer> list = new ArrayList<> ();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    
                    if(!result.contains(list))
                        result.add(list);
                    
                    while((low < high) && nums[low] == nums[low+1])low++; // avoiding duplicates
                    while((low < high) && nums[high] == nums[high-1])high--; // avoiding duplicates
                    
                    low++;
                    high--;
                }
                else if((nums[low]+nums[high]) > sum)
                    high--;
                else
                    low++;
            }
        }
        
        return result;
    }
}