class Solution {
    public int bits(int num, int[] memo){
        if(num == 0)
            return 0;
        
        if(num == 1)
            return 1;
        
        if(memo[num] != 0)
            return memo[num];
        
        if((num&1) != 1){
            int solve = bits(num/2, memo);
            memo[num] = solve;
            return solve;
        }else{
            int solve = 1 + bits(num/2, memo);
            memo[num] = solve;
            return solve;
        }
    }
    
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        
        for(int i=0; i<n+1; i++){
            result[i] = bits(i, result);
        }
        
        return result;
    }
}