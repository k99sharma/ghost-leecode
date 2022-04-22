import java.util.*;

public class Solution{
    public static int geekNum(int A, int B, int C, int N){
        if(N == 1)
            return A;
            
        else if(N == 2)
            return B;
            
        else if(N == 3)
            return C;
            
        return geekNum(A, B, C, N-1) + geekNum(A, B, C, N-2) + geekNum(A, B, C, N-3);
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        
        while(tc > 0){
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int N = in.nextInt();
            
            System.out.println(geekNum(A, B, C, N));
            
            tc--;
        }
    }
}