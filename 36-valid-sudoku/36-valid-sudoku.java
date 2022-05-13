class Solution {
    public boolean isValid(char[][] board, int row, int col, char value){        
        for(int i=0; i<9; i++){
            if(board[i][col] == value && i != row){
                return false;
            }
            
            if(board[row][i] == value && i != col){
                return false;
            }
            
            int r = 3 * (row / 3) + i / 3;
            int c = 3 * (col / 3) + i % 3;
            if(board[r][c] == value && r != row && c != col){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    if(!isValid(board, i, j, board[i][j])){
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}