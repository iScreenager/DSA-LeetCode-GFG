class Solution {
    public int[] twoSum(int[] nums, int target) {
           int[] idx = new int[2]; 
        int i=0;
        int j= nums.length-1;
            
            while(i <= j){
                    
                    int n = nums[i]+nums[j];
                    
                    if(n == target){
                            int[] ans = {i+1, j+1};
                return ans;
                    
                    }else if(n > target){
                            j--;
                    }else{
                            i++;
                    }
            }
           return nums;
            
            
           
    }
}