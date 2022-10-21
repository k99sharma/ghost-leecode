//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Long> find(long nums[], int n, int target)
    {
        // code here
        int low = 0;
        int high = nums.length-1;
        ArrayList<Long> res = new ArrayList<> ();
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(nums[mid] == target){
                int i = mid;
                int j = mid;
                
                while((i-1) >= 0 && nums[i-1] == target) i--;
                
                while((j+1) < nums.length && nums[j+1] == target) j++;
                
                res.add((long) i);
                res.add((long) j);
                return res;
            }
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        
        res.add((long) -1);
        res.add((long) -1);
        return res;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends