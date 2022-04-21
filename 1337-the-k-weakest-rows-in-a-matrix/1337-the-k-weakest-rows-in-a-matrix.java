class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
            int[] arr = new int[mat.length];
            for(int i=0;i<mat.length;i++){
                    int count = search1(mat[i]);
                    arr[i] = count;
                    
            }
            int[] res = new int[k];
        for(int i=0; i<k; i++)
        {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[j] < min)
                {
                    min = arr[j];
                    index = j;
                }
            }
            res[i] = index;
            arr[index] = Integer.MAX_VALUE;
        }
        return res;
            
            }
        
    
        
        public static int search1(int[] row){
                int c = 0;
                for(int i=0;i<row.length;i++){
                        if(row[i] == 1){
                                c++;
                        }
                }
                return c;
                
        }
}