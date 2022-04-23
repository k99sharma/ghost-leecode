class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        
        if(n == 1)
            return true;
        
        if(!isPowerOfTwo(n/2))
            return false;
        
        if(n%2 == 0)
            return true;
        
        return false;
    }
}