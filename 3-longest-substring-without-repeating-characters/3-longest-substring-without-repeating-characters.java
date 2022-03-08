class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        
        if(s.length() == 1)
            return 1;
        
        int last = 0;
        
        int i=0, j=0;
        
        HashMap<Character, Integer> hm = new HashMap<> ();
        while(i < s.length() && j<s.length()){
            // if character not present in hashmap
            if(hm.getOrDefault(s.charAt(j), 0) != 1){
                hm.put(s.charAt(j), 1);
                j += 1;
            }
            
            else{
                last = Math.max(last, j-i);
                i += 1;
                j = i;
                hm.clear();
            }
        }
        
        last = Math.max(last, j-i);
        
        return last;
    }
}