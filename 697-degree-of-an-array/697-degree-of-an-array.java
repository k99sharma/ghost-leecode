class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> left = new HashMap<> (), right = new HashMap<> (), count = new HashMap<> ();
        
        for(int i=0; i<nums.length; i++){
            int x = nums[i];
            
            // we are only putting in left if x is not present in left map
            if(left.get(x) == null)
                left.put(x, i);
            
            right.put(x, i); // it is working because last occurance of x updates this value
            count.put(x, count.getOrDefault(x,0) + 1);
        }
        
        int result = nums.length;
        int degree = Collections.max(count.values());
        
        for(int x : count.keySet()){
            if(count.get(x) == degree)
                // getting the length of subarray form first and last occurance of number
                result = Math.min(result, right.get(x) - left.get(x) + 1);
        }
        
        return result;
    }
}