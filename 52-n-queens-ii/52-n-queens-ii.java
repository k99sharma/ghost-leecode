class Solution {
    int count = 0;
    
    public void dfs(int col, char[][] board){
        if(col == board.length){
            count++;
            return;
        }    
        
        for(int row=0; row<board.length; row++){
            if(validate(board, row, col)){
                board[row][col] = 'Q';
                dfs(col+1, board);
                board[row][col] = '.';
            }
        }
    }
    
    public boolean validate(char[][] board, int row, int col){
        int dupRow = row;
        int dupCol = col;
        
        // top left diagonal
        while(row >= 0 && col >=0){
            if(board[row][col] == 'Q')
                return false;
            
            row--;
            col--;
        }
        
        row = dupRow;
        col = dupCol;
        
        // checking in left side
        while(col >= 0){
            if(board[row][col] == 'Q'){
                return false;
            }
            
            col--;
        }
        
        row = dupRow;
        col = dupCol;
        
        // bottom left diagonal
        while(col >= 0 && row < board.length){
            if(board[row][col] == 'Q')
                return false;
            
            row++;
            col--;
        }
        
        return true;
    }
    
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        
        dfs(0, board);  
        
        return count;
    }
}