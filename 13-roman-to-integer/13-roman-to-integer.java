class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<> ();
        // adding values in hash map
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        // base case: if string length is 1
        if(s.length() == 1)
            return hm.get(s.charAt(0));
        
        char lastCharacter = s.charAt(s.length() - 1);
        int result = hm.get(lastCharacter); 

        for(int i=s.length()-2; i>=0; i--){
            if(hm.get(s.charAt(i)) < hm.get(s.charAt(i+1)))
                result -= hm.get(s.charAt(i));
            else
                result += hm.get(s.charAt(i));
        }

        return result;
    }
}