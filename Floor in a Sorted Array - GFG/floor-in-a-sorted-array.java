//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Searching
{
    public static void main (String[] args)throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
           String a[] = read.readLine().trim().split("\\s+");
           int n = Integer.parseInt(a[0]);
           long x = Long.parseLong(a[(int)1]);
           String st[] = read.readLine().trim().split("\\s+");
        
           long arr[] = new long[n];
           for(int i = 0; i < n; i++)
           {
               arr[i] = Long.parseLong(st[i]);
           }
           
           System.out.println(new Solution().findFloor(arr, n, x));
          
        }
    }
    
}
// } Driver Code Ends


class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long nums[], int n, long x)
    {
        int low = 0;
        int high = nums.length - 1;
        int pos = -1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] == x) return mid;

            else if(nums[mid] > x) high = mid-1;

            else{
                int i = mid;
                
                while((i+1) < nums.length && nums[i] < x) i++;
                
                pos = i;
                
                break;
            }
        }

        return pos;
    }
    
}
