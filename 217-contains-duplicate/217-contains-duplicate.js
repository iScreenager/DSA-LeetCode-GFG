/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
     nums.sort();
 
    for(let i=1;i<nums.length;i++ ){
        if(nums[i-1]==nums[i])
            return true;
    }
    return false;
    
};