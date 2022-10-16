//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<> ();
        
        // sort the array
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-3; i++){
            if(i == 0 || i>0 && nums[i-1] != nums[i]){
                int sum = target - nums[i];
                
                for(int j=i+1; j<nums.length-2; j++){
                    if(nums[j] != nums[j-1]){
                        
                    }
                        int diff = sum - nums[j];
                        int high = nums.length-1;
                        int low = j+1;
                        
                        while(low < high){
                            // we found match
                            if((nums[low]+nums[high]) == diff){
                                ArrayList<Integer> list = new ArrayList<> ();
                                list.add(nums[i]);
                                list.add(nums[j]);
                                list.add(nums[low]);
                                list.add(nums[high]);
                                if(!result.contains(list))
                                    result.add(list);
                                
                                while(low < nums.length-1 && nums[low] == nums[low+1]) low++;
                                while(high > j+1 && nums[high] == nums[high-1]) high--;
                                
                                low++;
                                high--;
                            }
                            else if((nums[low]+nums[high]) < diff) 
                                low++;
                            else 
                                high--;
                    }
                }
            }
        }
        
        return result;
    }
}