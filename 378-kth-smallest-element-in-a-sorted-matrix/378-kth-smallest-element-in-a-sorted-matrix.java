class Solution {
    public int kthSmallest(int[][] matrix, int k) {
            int n = matrix.length;
        int lo = matrix[0][0], hi = matrix[n-1][n-1];
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (count(matrix, mid) < k)
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
        
    
        
            
        
    }
        public int count(int[][] matrix, int mid){
                int count=0;
                int r = matrix.length-1;
                int c =0;
                while(r>=0 && c<matrix.length){
                       if(matrix[r][c] <= mid){
                               count+= r + 1;;
                               c++;
                               
                       } 
                        else{
                                r--;
                        }
                }
                return count;
        }
}