class Solution {
    public boolean isPowerOfTwo(int n) {
        int counter = 0;
        
        while(n > 0){
            if((n&1) == 1)
                counter++;
            
            n = n>>1;
        }
        
        if(counter == 1)
            return true;
        
        return false;
    }
}