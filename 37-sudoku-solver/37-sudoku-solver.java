class Solution {
    public void solveSudoku(char[][] board) {
        // we are trying to solve the board
        if(!solve(board))
            System.out.println("Cannot be solved");
    }
    
    public boolean solve(char[][] board){
        // traversing each cell in board
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                // if cell is empty
                if(board[i][j] == '.'){
                    // we are gonna try every character for that cell
                    for(char c='1'; c<='9'; c++){
                        // if character is valid in that cell
                        if(isValid(board, c, i, j)){
                            board[i][j] = c; // put it
                            
                            // try solving the board with updation of this cell
                            if(solve(board))
                                return true;
                            
                            else
                                board[i][j] = '.'; // if cannot solve remove the value placed
                        }
                    }
                    
                    // if cannot solve the whole board
                    return false;
                }
            }
        }
        
        // if whole board is solved
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