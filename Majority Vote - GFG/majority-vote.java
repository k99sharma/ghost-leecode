//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] nums = IntArray.input(br, n);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.Solve(n, nums);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> Solve(int  kn, int[] nums) {
        ArrayList<Integer> ans = new ArrayList<> ();
        HashMap<Integer, Integer> hmap = new LinkedHashMap<>();

        for(int num : nums){
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        int n = nums.length/3;
        for(Map.Entry<Integer, Integer> map : hmap.entrySet()){
            if(map.getValue() > n)
                ans.add(map.getKey());
        }
        
        if(ans.size() == 0)
            ans.add(-1);

        return ans;
    }
}
        
