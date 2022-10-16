//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int nums[], int n)
    {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        int ans = 0;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            if(nums[i] == 0 && ans == 0)
                ans = 1;

            if(sum == 0)
                ans = i+1;

            if(hmap.containsKey(sum))
                ans = Math.max(ans, i-hmap.get(sum));
            else hmap.put(sum, i);
        }

        return ans;
    }
}