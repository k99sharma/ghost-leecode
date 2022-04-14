// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        Stack<Character> st = new Stack<> ();
        
        int count = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(st.empty()){
                if(ch == '}')
                    count++;
                    
                st.push('{');
            }else{
                if(ch == '}')
                    st.pop();
                
                else
                    st.push('{');
            }
        }
        
        if(st.size()%2 == 0){
            count += st.size()/2;
            return count;
        }
        
        return -1;
    }
}