//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long n)
	 {
	     if(n == 0 || n == 1)
	        return 1;
	        
	    long start = 1;
        long end = n;
        long ans = 0;

        while(start <= end){
            long mid = (start+end)/2;

            if(mid*mid == n)
                return mid;

            else if(mid*mid < n){
                ans = mid;
                start = mid+1;
            }else end = mid-1;
        }

        return ans;
	 }
}
