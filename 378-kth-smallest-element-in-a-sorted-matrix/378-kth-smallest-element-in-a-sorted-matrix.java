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
        public int count(int[][] matrix, int k){
                int count=0;
                for(int i=0;i<matrix.length;i++){
                        for(int j=0;j<matrix[0].length;j++){
                                if(matrix[i][j] <= k) count++;
                        }
                }
                return count;
        }
}