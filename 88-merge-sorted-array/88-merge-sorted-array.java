class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int avilabeIndex = nums1.length-1;
        m--;
        n--;
        while(m>=0 && n>=0){
            if(nums1[m]>=nums2[n]){
                nums1[avilabeIndex]=nums1[m];
                m--;
            }else{
                nums1[avilabeIndex] = nums2[n];
                n--;
            }
            avilabeIndex--;
        }
        while(n>=0){
            nums1[avilabeIndex] = nums2[n];
            n--;
            avilabeIndex--;
        }
       
    }
}