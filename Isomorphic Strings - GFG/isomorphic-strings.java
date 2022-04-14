// { Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}
// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length()!=str2.length()) return false;
        
        int n= str1.length();
        Map<Character,Character> mp1 = new HashMap<>();
        Map<Character,Character> mp2 = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            // if both map doesn't contains str character
            if(!mp1.containsKey(str1.charAt(i)) && !mp2.containsKey(str2.charAt(i))){
                mp1.put(str1.charAt(i),str2.charAt(i));
                mp2.put(str2.charAt(i),str1.charAt(i));
            }
            else if(mp1.containsKey(str1.charAt(i))){
                
                if((mp1.get(str1.charAt(i))!=str2.charAt(i))){
                return false;
             }
            }
            else if(mp2.containsKey(str2.charAt(i))){
                
                if((mp2.get(str2.charAt(i))!=str1.charAt(i))){
                return false;
             }
            }
        }
        
        return true;

    }
}