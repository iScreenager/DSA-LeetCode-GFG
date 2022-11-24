class Solution {
    public boolean check(int[] nums) {
             
            int c = 0;
            int len = nums.length;
            for(int i=0;i<len;i++){
                    
                    if(nums[i] > nums[(i+1)%len]){
                           c++;
                           
                    }
                    
                    
            }
            
            if(c>1){
                    return false;
            }else{
                    return true;
            }
        
    }
}