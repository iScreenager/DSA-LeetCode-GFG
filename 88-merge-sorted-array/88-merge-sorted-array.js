/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    let i = m-1;
    let j = n-1;
    let k = nums1.length-1;
   while(i>=0 && j>=0){
        if(nums2[j]>=nums1[i]){
            nums1[k] = nums2[j];
            j--;
        }else{
            nums1[k] = nums1[i];
        i--;
        }
        
        k--;
    }
    while(j>=0){
        nums1[k] = nums2[j];
        j--;
        k--;
    }
    
};