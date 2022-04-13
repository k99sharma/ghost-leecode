class Solution {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        
        String s = countAndSay(n-1);
        String res = "";
        
        int count = 1;
        int i = 0;
        while(i<s.length()){
            int j = i;
            
            while(j < s.length()-1 && s.charAt(j) == s.charAt(j+1)){
                j++;
                count++;
            }
            
            res += count;
            res += s.charAt(i);
            
            i = j+1;
            count = 1;
        }
        
        return res;
    }
}