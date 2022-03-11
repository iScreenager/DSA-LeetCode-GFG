class Solution {
    public int maxSubArray(int[] nums) {
       if(nums.length == 1){
           return nums[0];
       }
        int posmax = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
        
                 posmax += nums[i];
                
                if(posmax > max){
                    max = posmax;
                }  
            if(posmax<0){
                posmax=0;
            }
                
            }
        
        return max;
        
    }
}