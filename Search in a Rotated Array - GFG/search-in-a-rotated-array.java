//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            
            System.out.println(new Solution().search(A, 0, n - 1, key));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int nums[], int l, int h, int target)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        int low = l;
        int high = h;
        int pivot = nums[0];
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(nums[mid] == target) return mid;
            
            if(nums[low] == target) return low;
            
            if(nums[high] == target) return high;
            
            if(target > pivot) high--;
            
            else low++;
        }
        
        return -1;
    }
}