class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
            int c = matrix[0].length;
            
            int[] dummyR = new int[r];
            int[] dummyC = new int[c];
            
             Arrays.fill(dummyR,-1);
  Arrays.fill(dummyC,-1);
            for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                            if(matrix[i][j] == 0){
                                    dummyR[i] = 0;
                                    dummyC[j] = 0;
                            }
                    }
            }
            
            for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                            if(dummyR[i] == 0 || dummyC[j] == 0){
                                    matrix[i][j] = 0;
                            }
                    }
            }
            
    }
}