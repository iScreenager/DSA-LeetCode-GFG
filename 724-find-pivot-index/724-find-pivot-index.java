class Solution {
    public int pivotIndex(int[] nums) {
       int totalSum = 0;
        for(int i:nums){
            totalSum += i;
        }
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0;i<nums.length;i++){
            rightSum = totalSum - nums[i];
            if(leftSum == rightSum) return i;
            leftSum += nums[i];
            totalSum -= nums[i];
        }
        return -1;
    }
}