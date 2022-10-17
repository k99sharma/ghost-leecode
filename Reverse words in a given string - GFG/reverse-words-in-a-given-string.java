//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String str)
    {
        // code here
        StringTokenizer st = new StringTokenizer(str, ".");
        String result = "";

        while(st.hasMoreTokens()){
            result = st.nextElement() + "." + result;
        }

        return result.substring(0, result.length()-1);
    }
}