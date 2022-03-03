class Solution {
    public void reverse(int[] arr){
        int p=0, q=arr.length-1;
        
        while(p <= q){
            int temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            
            p++;
            q--;
        }
    }
    
    public void rotate(int[][] matrix) {
        // transposing the matrix
        for(int row=0; row<matrix.length; row++){
            for(int col=row; col<matrix[row].length; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        
        
        // reverse the array
        for(int row=0; row<matrix.length; row++)
            reverse(matrix[row]);
    }
}