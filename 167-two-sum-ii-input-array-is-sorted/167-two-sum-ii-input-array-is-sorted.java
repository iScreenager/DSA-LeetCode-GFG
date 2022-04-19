class Solution {
    public int[] twoSum(int[] nums, int target) {
        int e=nums.length-1;

            for(int i=0;i<nums.length;i++){
                    int s = i+1;
                    
                    while(s <= e){
                            int m = s+(e-s)/2;
                            
                            if(nums[i]+nums[m] == target){
                                    return new int[] {i+1,m+1};
                            }else if(nums[i]+nums[m] < target){
                                    s=m+1;
                            }else{
                                    e=m-1;
                            }
                            
                    }
            }
           return new int[] {-1,-1}; 
            
    }
}