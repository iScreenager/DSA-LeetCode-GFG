/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let ans = new Array();
    for(let i=0;i<nums.length;i++){
        for(let j=i+1;j<nums.length;j++){
            if(target == nums[i]+nums[j]){
                ans[0]= i;
                ans[1] = j;
                break;
            }
        }
    }
    
    
   return ans; 
};