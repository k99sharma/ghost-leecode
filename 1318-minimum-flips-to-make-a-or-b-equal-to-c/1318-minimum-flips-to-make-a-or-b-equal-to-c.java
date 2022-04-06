class Solution {
    public int minFlips(int a, int b, int c) {
        int count = 0;
        
        int max = (a > b) ?
          (a > c ? a : c) :
          (b > c ? b : c);
        
        while(max != 0){
            int rmb_a = a&1;
            int rmb_b = b&1;
            int rmb_c = c&1;
            
            
            
            if(rmb_c == 1){
                if(rmb_a == 0 && rmb_b == 0)
                    count += 1;
            }
            else{
                    if(rmb_a == 1 && rmb_b == 1)
                        count += 2;
                    else if((rmb_a == 1 && rmb_b == 0) || (rmb_a == 0 && rmb_b == 1))
                        count += 1;
                }
                        
            c = c >> 1;
            a = a >> 1;
            b = b >> 1;
            max = max >> 1;
        }
        
        return count;
    }
}