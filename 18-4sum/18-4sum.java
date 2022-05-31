class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<> ();
        
        // sort the array
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-3; i++){
            if(i == 0 || i>0 && nums[i-1] != nums[i]){
                int sum = target - nums[i];
                
                for(int j=i+1; j<nums.length-2; j++){
                        int diff = sum - nums[j];
                        int high = nums.length-1;
                        int low = j+1;
                        
                        while(low < high){
                            // we found match
                            if((nums[low]+nums[high]) == diff){
                                List<Integer> list = new ArrayList<> ();
                                list.add(nums[i]);
                                list.add(nums[j]);
                                list.add(nums[low]);
                                list.add(nums[high]);
                                if(!result.contains(list))
                                    result.add(list);
                                
                                while(low < nums.length-1 && nums[low] == nums[low+1]) low++;
                                while(high > j+1 && nums[high] == nums[high-1]) high--;
                                
                                low++;
                                high--;
                            }
                            else if((nums[low]+nums[high]) < diff) 
                                low++;
                            else 
                                high--;
                    }
                }
            }
        }
        
        return result;
    }
}