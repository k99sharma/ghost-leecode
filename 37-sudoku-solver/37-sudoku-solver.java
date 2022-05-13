class Solution {
    public void solveSudoku(char[][] board) {
        if(!solve(board))
            System.out.println("Cannot be solved");
    }
    
    public boolean solve(char[][] board){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    for(char c='1'; c<='9'; c++){
                        if(isValid(board, c, i, j)){
                            board[i][j] = c;
                            
                            if(solve(board))
                                return true;
                            
                            else
                                board[i][j] = '.';
                        }
                    }
                    
                    return false;
                }
            }
        }
        
        return true;
    }
    
    static boolean isValid(char[][] grid, char val, int row, int col){
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == val)
                return false;
            
            if (grid[row][i] == val)
                return false;
            
            if (grid[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == val)
                return false;
        }
                
        return true;
    }
}