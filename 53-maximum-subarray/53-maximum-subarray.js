/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    if(nums.length == 1){
        return nums[0];
    }
    
     let posmax = nums[0];
    let max = nums[0];
   
    for(let i=1;i<nums.length;i++){
        
        posmax = Math.max(nums[i],posmax+nums[i]);
        
        max = Math.max(posmax,max);
       
         
        
        
    }
    return max;
    
    
};