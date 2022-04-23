class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
            int i=0;
            int max = 0;
           while(i < nums1.length){
                   int s = 0;
                   int e = nums2.length-1;
                   while(s <= e){
                   int m = s+(e-s)/2;
                   
                   if(nums2[m] >= nums1[i]){
                           max = Math.max(m-i,max);
                           s = m+1;
                          
                   }else{
                           e = m-1;
                   }
                   }
                   i++;
                  
           
                   
           }
            return max;
        
    }
}