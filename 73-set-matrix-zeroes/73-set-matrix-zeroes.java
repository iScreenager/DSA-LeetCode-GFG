class Solution {
    public void setZeroes(int[][] matrix) {
            int rowSize = matrix.length;
            int colSize = matrix[0].length;
            int col0 = 1;
            
            for(int row = 0; row < rowSize; row++){
                    if(matrix[row][0] == 0) col0 = 0;
                    for(int col = 1; col<colSize;col++){
                            if(matrix[row][col] == 0){
                                    matrix[row][0] = 0;
                                    matrix[0][col] = 0;
                                    
                            }
                    }
            }
            
             for (int i = rowSize - 1; i >= 0; i--) {
            for (int j = colSize - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;
        }
        
    }
}