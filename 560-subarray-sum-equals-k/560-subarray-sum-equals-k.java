class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        int count = 0;
        
        // creating prefix array
        prefix[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        
        HashMap<Integer, Integer> map = new HashMap<> ();
        
        for(int i=0; i<nums.length; i++){
            if(prefix[i] == k)
                count++;
            
            if(map.containsKey(prefix[i] - k))
                count += map.get(prefix[i]-k);
            
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }
        
        return count;
    }
}