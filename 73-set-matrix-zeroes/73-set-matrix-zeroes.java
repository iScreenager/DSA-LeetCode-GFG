class Solution {
    public void setZeroes(int[][] matrix) {
            int[] dummyRow = new int[matrix.length];
            int[] dummyCol = new int[matrix[0].length];
            
            for(int idxRow=0;idxRow<matrix.length;idxRow++){
                    for(int idxCol=0;idxCol<matrix[0].length;idxCol++){
                            if(matrix[idxRow][idxCol] == 0){
                                    dummyRow[idxRow] = -1;
                                    dummyCol[idxCol] = -1;
                                    
                            }
                    }
            }
                     for(int idxRow=0;idxRow<matrix.length;idxRow++){
                    for(int idxCol=0;idxCol<matrix[0].length;idxCol++){
                            if( dummyRow[idxRow] == -1 || dummyCol[idxCol] == -1){
                                   
                                    matrix[idxRow][idxCol] = 0;
                            }
                    }
            }
        
    }
}