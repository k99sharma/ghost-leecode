// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        boolean flag = true;
        
        int p = 0;
        int q = S.length() - 1;
        
        while(p <= q){
            if(S.charAt(p) != S.charAt(q)){
                flag = false;
                break;
            }
            
            p++;
            q--;
        }
        
        return flag ? 1 : 0;
    }
};