class Solution {
    public void reverse(char[] s, int idx){
        if(idx == s.length/2)
            return;
        
        // swap with respective idx
        char temp = s[idx];
        s[idx] = s[s.length - idx - 1];
        s[s.length - idx - 1] = temp;
        
        reverse(s, idx+1);
    }
    
    public void reverseString(char[] s) {
        // recursive approach
        reverse(s, 0);
    }
}