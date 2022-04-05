public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        int rsbm=0;
        
        while(n!=0){
            rsbm= (n & -n);
            n-=rsbm;
            count++;
        }
        return count;
    }
}