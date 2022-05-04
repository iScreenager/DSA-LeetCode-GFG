class Solution {
    public int maxOperations(int[] nums, int k) {
            Arrays.sort(nums);
       int s = 0;
            int e = nums.length-1;
            int c = 0;
            
            while(s < e){
                   int temp = nums[s]+nums[e];           
                    if(temp == k){
                            s++;
                            e--;
                            c++;
                    }else if(temp < k){
                            s++;
                    }else{
                           e--;
                    }
            }
            return c;
            
           
    }
}