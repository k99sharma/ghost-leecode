class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<> ();
        
        // creating hash map
        for(int x : nums){
            if(hm.containsKey(x))
                hm.put(x, hm.get(x) + 1);
            else
                hm.put(x, 1);
        }
        
        int cond = nums.length/2;
        int ele = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue() > cond){
                ele = entry.getKey();
                break;
            }
        }
        
        return ele;
    }
}