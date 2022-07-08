class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix[0].length;
            
            for(int i=0;i<matrix.length;i++){
                    for(int j=i;j<matrix[0].length;j++){
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[j][i];
                            matrix[j][i] = temp;
                            
                    }
            }
            
            for(int i=0;i<matrix.length;i++){
                    for(int j=0;j<len/2;j++){
                          int temp = matrix[i][j];
                            matrix[i][j] = matrix[i][len-1-j];
                            matrix[i][len-1-j] = temp;  
                    }
            }
    }
}