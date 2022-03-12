class Solution {
    public int maxProduct(int[] nums) {
        int posmax = 1;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            posmax = posmax*nums[i];
            if(posmax > max){
                max = posmax;
            }
            if(posmax == 0){
                posmax = 1;
            }
            
        }
        posmax = 1;
        for(int i=nums.length-1;i>=0;i--){
            posmax = posmax*nums[i];
            if(posmax > max){
                max = posmax;
            }
            if(posmax == 0){
                posmax = 1;
            }
            
        }
        return max;
        
    }
}