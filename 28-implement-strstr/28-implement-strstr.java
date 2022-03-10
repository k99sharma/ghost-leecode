class Solution {
    public int strStr(String haystack, String needle) {
        // if empty string
        if(needle.length() == 0)
            return 0;
        
        int match = -1;
        
        for(int i=0; i<haystack.length() - needle.length() + 1; i++){
            char curr = haystack.charAt(i);
            
            // if first letter matches
            if(curr == needle.charAt(0)){
                match = i;
                int m = i;
                int n = 0;
                
                while(n < needle.length()){
                    if(haystack.charAt(m) != needle.charAt(n)){
                        match = -1;
                        break;
                    }
                    
                    n++;
                    m++;
                }
                
                if(match != -1)
                    break;
            }
        }
        
        return match;
    }
}