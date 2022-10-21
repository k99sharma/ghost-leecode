//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int solve(int[] nums, int target, int low, int high){
        if(low > high) return -1;

        int mid = low + (high-low)/2;

        if(nums[mid] == target) return mid;

        else if(nums[mid] > target) return solve(nums, target, low, mid-1);

        else return solve(nums, target, mid+1, high);
    }
    
    int binarysearch(int arr[], int n, int k) {
        // code here
        return solve(arr, k, 0, n-1);
    }
}