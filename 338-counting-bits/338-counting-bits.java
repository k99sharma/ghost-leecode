class Solution {
    public int bits(int num){
        if(num == 0)
            return 0;
        
        if(num == 1)
            return 1;
        
        if((num&1) != 1)
            return bits(num/2);
            
        return 1 + bits(num/2);
    }
    
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        
        for(int i=0; i<n+1; i++){
            result[i] = bits(i);
        }
        
        return result;
    }
}