class Solution {
    public String longestCommonPrefix(String[] strs) {
        // first array element
        String lcp = strs[0];
        
        
        for(int i=1; i<strs.length; i++) {
            // minimum length
            int minLen = Math.min(lcp.length(), strs[i].length());
            lcp = lcp.substring(0, minLen);
            for(int j=0; j<lcp.length(); j++) {
                if(strs[i].charAt(j) != lcp.charAt(j)) {
                    lcp = lcp.substring(0,j);
                    break;
                }
            }
        }
        return lcp;
    }
}