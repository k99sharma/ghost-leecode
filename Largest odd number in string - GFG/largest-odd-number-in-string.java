//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.maxOdd(s));
        }
    }
}
// } Driver Code Ends


class Solution {

    String maxOdd(String num) {
        // code here
        int select = 0;
        for(int i=num.length()-1; i >= 0; i--){
            int digit = num.charAt(i) - '0';

            if(digit%2 != 0){
                select = i;
                break;
            }
        }

        if(select == 0 && (num.charAt(0)-'0')%2 == 0)
            return "";

        return num.substring(0, select+1);
    }
}