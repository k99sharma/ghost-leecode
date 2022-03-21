class Position{
    int row;
    int col;
    
    Position(int row, int col){
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public void setRowZero(int[][] matrix, int row){
        for(int col=0; col<matrix[row].length; col++){
            matrix[row][col] = 0;
        }
    }
    
    public void setColumnZero(int[][] matrix, int col){
        for(int row=0; row<matrix.length;row++){
            matrix[row][col] = 0;
        }
    }
    
    public void setZeroes(int[][] matrix) {
        HashSet<Position> hs = new HashSet<> ();
        
        // finding cells where 0 is present
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                if(matrix[row][col] == 0){
                    Position pos = new Position(row, col);
                    hs.add(pos);
                }
            }
        }
        
        // iterating over set and 0ing the columns and rows
        for(Position pos : hs){
            // zero row
            setRowZero(matrix, pos.row);
            
            // zero column
            setColumnZero(matrix, pos.col);
        }
    }
}