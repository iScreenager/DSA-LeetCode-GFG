class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
            ArrayList<Integer> list = new ArrayList<>();
            int minr = 0;
            int minc = 0;
            int maxr = matrix.length-1;
            int maxc = matrix[0].length-1;
            int telm = matrix.length*matrix[0].length;
            int elm = 0;

            while(elm < telm){
                    //1st wall
                    
                    for(int c=minc; c<= maxc && elm<telm; c++){
                            list.add(matrix[minr][c]);
                           elm++;
                    }
                    minr++;
                    
                    //2nd wall
                     
                    for(int r=minr; r<=maxr && elm<telm; r++){
                            list.add(matrix[r][maxc]);
                             elm++;
                    }
                     
                    maxc--;
                    
                    //3rd wall
                    
                    for(int c=maxc; c>=minc && elm<telm;c--){
                            list.add(matrix[maxr][c]);
                             elm++;
                    }
                     
                    maxr--;
                    
                    //4th wall
                    
                    for(int r=maxr; r>=minr && elm<telm; r--){
                             list.add(matrix[r][minc]);
                             elm++;
                    }
                     
                    minc++;
                    
            }
            return list;
    }
}