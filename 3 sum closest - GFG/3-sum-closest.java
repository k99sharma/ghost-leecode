//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int X = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.closest3Sum(Arr, N, X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int closest3Sum(int nums[], int N, int x)
    {
        // sort array
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int lastDiff = Integer.MAX_VALUE;

        for(int i=0; i<nums.length-2; i++){
            int low = i+1;
            int high = nums.length-1;
            int sum = x - nums[i];

            if(i == 0 || i>0 && (nums[i] != nums[i-1])){
                while(low < high){
                    if(nums[low] + nums[high] == sum){
                        return x;
                    }
                    else if(nums[low]+nums[high] > sum){
                        int currentSum = nums[i] + nums[low] + nums[high];

                        int diff = Math.abs(currentSum-x);
                        if(diff < lastDiff){
                            lastDiff = diff;
                            ans = currentSum;
                        }

                        high--;
                    }else{
                        int currentSum = nums[i] + nums[low] + nums[high];

                        int diff = Math.abs(currentSum-x);
                        if(diff < lastDiff){
                            lastDiff = diff;
                            ans = currentSum;
                        }

                        low++;
                    }
                }
            }
        }

        return ans;
    }
}