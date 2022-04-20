class Solution {
    public int countNegatives(int[][] grid) {
           int c = 0;
            for(int i=0;i<grid.length;i++){
                    c += binarySearch(grid[i]);
            }
        
            return c;
    }
        
        public static int binarySearch(int[] row){
           int c = 0;
                int s = 0;
                int e = row.length-1;
                
                while(s <= e){
                        int m = s+(e-s)/2;
                        
                        if(row[m] >= 0){
                                s=m+1;
                                
                        }else{
                              c += e - m + 1;;
                               e = m-1; 
                        }
                }
                return c;
        }
}