class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
            int i=0;
            int j=0;
            int max = 0;
            
            while(i<nums1.length && j<nums2.length){
                    if(nums1[i]>nums2[j]){
                            i++;
                    }else{
                            max = Math.max(j-i,max);
                            j++;
                    }
            }
            return max;
        
    }
}