class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        if(poured == 0)
            return 0;
        
        double[][] tower = new double[query_row+1][query_glass+2];
        
        tower[0][0] = poured;
        
        for(int i=0; i<query_row; i++){
            for(int j=0; j<=query_glass; j++){
                if(tower[i][j] > 1.0){
                    double left = tower[i][j] - 1.0;
                    double spare = left/2;
                    tower[i][j] = 1.0;
                    tower[i+1][j] += spare;
                    tower[i+1][j+1] += spare;
                }
            }
        }
        
        return Math.min(tower[query_row][query_glass], 1.0);
    }
}