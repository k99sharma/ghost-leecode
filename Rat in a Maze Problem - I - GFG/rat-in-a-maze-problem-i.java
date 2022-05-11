// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static void findPath(int[][] mat, ArrayList<String> result, int x, int y, String comb, int N, int[][] vis){
        // BASE CASE: destination is reached
        if(x == N-1 && y == N-1){
            result.add(comb);       // add combination to result
            return;
        }

        // direct rat to other paths
        // upwards: U
        if((x-1) >= 0 && vis[x-1][y] == 0 && mat[x-1][y] == 1){
            // mark the cell
            vis[x][y] = 1;
            
            comb += "U";     
            findPath(mat, result, x-1, y, comb, N, vis);
            
            // unmark the cell
            vis[x][y] = 0;
            comb = comb.substring(0, comb.length()-1);
        }
        
        // downwards: D
        if((x+1) < N && vis[x+1][y] == 0 && mat[x+1][y] == 1){
            // mark the cell
            vis[x][y] = 1;
            
            comb += "D";
            findPath(mat, result, x+1, y, comb, N, vis);

            // unmark the cell
            vis[x][y] = 0;
            comb = comb.substring(0, comb.length()-1);
        }
        
        // right: R
        if((y+1) < N && vis[x][y+1] == 0 && mat[x][y+1] == 1){
            // mark the cell
            vis[x][y] = 1;
            
            comb += "R";
            findPath(mat, result, x, y+1, comb, N, vis);
            
            // unmark the cell
            vis[x][y] = 0;
            comb = comb.substring(0, comb.length()-1);
        }
        
        // left: L
        if((y-1) >= 0 && vis[x][y-1] == 0 && mat[x][y-1] == 1){
            // mark the cell
            vis[x][y] = 1;
            
            comb += "L";
            findPath(mat, result, x, y-1, comb, N, vis);
            
            // unmark the cell
            vis[x][y] = 0;
            comb = comb.substring(0, comb.length()-1);
        }
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> result = new ArrayList<> ();
        
        // aux array to keep track of visited cells
        int[][] vis = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                vis[i][j] = 0;
            }
        }
        
        // if (0,0) is blocked
        if(m[0][0] == 0)
            return result;
        
        findPath(m, result, 0, 0, "", n, vis);
        
        return result;
    }
}