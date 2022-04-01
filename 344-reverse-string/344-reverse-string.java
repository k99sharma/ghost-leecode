class Solution {
    public void reverseString(char[] s) {
        int p = 0;
        int q = s.length-1;
        
        while(p <= q){
            int temp = s[p];
            s[p] = (char) s[q];
            s[q] = (char) temp;
            
            p++;
            q--;
        }
    }
}