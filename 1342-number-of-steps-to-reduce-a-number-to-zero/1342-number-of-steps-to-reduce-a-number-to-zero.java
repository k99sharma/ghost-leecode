class Solution {
    public int numberOfSteps(int num) {
        if(num == 0)
            return 0;
        
        if((num&1) == 1)
            num = num-1;
        
        else
            num = num/2;
            
        return numberOfSteps(num) + 1;
    }
}