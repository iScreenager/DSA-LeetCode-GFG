/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    let s = 0;
        let e = nums.length-1;
    
        while(s <= e){
            let mid = Math.floor(s+(e-s)/2);
            
            if(nums[mid]== target){
                return mid;
            }else if(nums[mid] < target){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return s;
        
    
};