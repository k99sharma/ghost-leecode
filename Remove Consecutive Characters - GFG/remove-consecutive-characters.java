// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
        String res = "";
        
        int p = 0;
        int q = 0;
        
        while(p < S.length() && q < S.length()){
            res += S.charAt(p);
            q = p+1;
            
            while(q < S.length()){
                if(S.charAt(p) == S.charAt(q))
                    q++;
                    
                else{
                    p=q;
                    break;
                }
            }
        }
        
        return res;
    }
}