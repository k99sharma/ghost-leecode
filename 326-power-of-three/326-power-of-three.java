class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0)
            return false;
        
        if(n == 1)
            return true;
        
        if(!isPowerOfThree(n/3))
            return false;
        
        if(n%3 == 0)
            return true;
        
        return false;
    }
}