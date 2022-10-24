//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int h = sc.nextInt();
            Solution obj = new Solution();
            int ans = obj.Solve(n,a,h);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static boolean canEatInTime(int[] piles, int k, int h){
        int hours = 0;

        for(int pile : piles){
            // if hours are already more
            if(hours > h)
                return false;

            int div = pile/k;
            hours += div;

            // if there is more than 1 banana left after eating
            // add hours
            if(pile%k != 0) hours++;
        }

        return hours <= h;
    }
    
    public static int Solve(int n, int[] piles, int h) {
        // code here
        int left = 1;
        int right =1000000000;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(canEatInTime(piles, mid, h)) right = mid-1;

            else left = mid + 1;
        }

        return left;
    }
}
        
