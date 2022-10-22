//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int[] nums, int n) {
        if(n == 1)
            return 0;
            
        int low = 0;
        int high = nums.length-1;
        int pivot = nums[0];
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(mid == 0 && nums[mid] > nums[mid+1])
                return mid+1;
            
            if(mid < nums.length-1 && nums[mid] > nums[mid+1])
                return mid+1;
            
            else if(nums[mid] > pivot) low++;
            else high--;
        }
        
        return 0;
    }
}