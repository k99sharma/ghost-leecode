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
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public static void reverse(int[] nums){
        int i = 0;
        int j = nums.length-1;

        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
    
    public int[] twoOddNum(int nums[], int N)
    {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int num : nums){
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[2];
        int counter = 0;

        for(Map.Entry<Integer, Integer> map : hmap.entrySet()){
            int freq = map.getValue();
            if((freq&1) == 1){
                ans[counter++] = map.getKey();
            }
        }

        Arrays.sort(ans);

        reverse(ans);

        return ans;
    }
}