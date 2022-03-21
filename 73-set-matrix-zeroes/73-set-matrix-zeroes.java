class Solution {
    public void setZeroes(int[][] matrix) {
        Boolean isCol = false;
        int N = matrix.length;
        int M = matrix[0].length;
        
        for(int row=0; row<N; row++){
            // checking if first cell (0,0) is 0 then mark isCol = true
            // we are doing this because for this cell ---> first column and first row is same
            if(matrix[row][0] == 0)
                isCol = true;
            
            for(int col=1; col<M; col++){
                // setting first column and first row as 0
                if(matrix[row][col] == 0){
                    matrix[0][col] = 0;
                    matrix[row][0] = 0;
                }
            }
        }
        
        // zeroing all the values of respective 0 row and 0 column
        for(int row=1; row<N; row++){
            for(int col=1; col<M; col++){
                if(matrix[0][col] == 0 || matrix[row][0] == 0)
                    matrix[row][col] = 0;
            }
        }
        
        // checking if first row needed to be zero
        if(matrix[0][0] == 0)
            for(int col=0; col<M; col++)
                matrix[0][col] = 0;
        
        // checking if first column needed to be zero
        if(isCol){
            for(int row=0; row<N; row++)
                matrix[row][0] = 0;
        }
    }
}