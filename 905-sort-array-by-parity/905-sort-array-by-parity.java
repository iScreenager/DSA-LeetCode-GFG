class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
                return nums;
        }
            
            int i = 0;
            int j = nums.length-1;
            
            while(i <= j){
                    if(nums[i]%2 == 0){
                            i++;
                    }else{
                            int temp = nums[i];
                            nums[i] = nums[j];
                            nums[j] = temp;
                           
                            j--;
                    }
            }
            return nums;
    }
}