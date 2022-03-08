class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int s = 0;
            for(int j=0;j<=i;j++){
                s += nums[j];
            }
            sum[i] = s;
        }
        return sum;
        
    }
}