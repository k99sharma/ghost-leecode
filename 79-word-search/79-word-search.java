class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0 ; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (searchWord(0, i, j, board, word)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean searchWord(int index, int i, int j, char[][] board, String word) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index) || board[i][j] == '#') {
            return false;
        }
        
        char currentChar = board[i][j];
        board[i][j] = '#'; // mark it as visited
        
        boolean result;
        result = searchWord(index+1, i+1, j, board, word)
            || searchWord(index+1, i-1, j, board, word)
            || searchWord(index+1, i, j+1, board, word)
            || searchWord(index+1, i, j-1, board, word);
        
        board[i][j] = currentChar; // asign back to original value -- backtracking
        
        return result;
    }
}