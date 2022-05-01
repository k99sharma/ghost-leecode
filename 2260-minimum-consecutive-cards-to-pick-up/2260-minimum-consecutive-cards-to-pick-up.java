class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> hmap = new LinkedHashMap<> ();
        int ans = Integer.MAX_VALUE;
        
        for(int i=0; i<cards.length; i++){
            if(hmap.containsKey(cards[i])){
                ans = Math.min(ans, i-hmap.get(cards[i])+1);
                hmap.put(cards[i], i);
            }else{
                hmap.put(cards[i], i);
            }
        }
        
        if(ans == Integer.MAX_VALUE)
            return -1;
        
        return ans;
    }
}