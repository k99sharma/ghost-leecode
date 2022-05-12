class Solution {
    public void dfs(int col, char[][] board, List<List<String>> result){
        if(col == board.length){
            result.add(construct(board));
            return;
        }    
        
        for(int row=0; row<board.length; row++){
            if(validate(board, row, col)){
                board[row][col] = 'Q';
                dfs(col+1, board, result);
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
    
    public List<String> construct(char[][] board){
        List<String> ans = new LinkedList<> ();
        for(int row=0; row<board.length; row++){
            String s = new String(board[row]);
            ans.add(s);
        }
        
        return ans;
    }
    
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        
        List<List<String>> result = new LinkedList<> ();
        dfs(0, board, result);
        
        return result;
    }
}