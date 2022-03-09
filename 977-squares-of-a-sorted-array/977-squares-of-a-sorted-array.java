class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sarray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
         
           sarray[i] = (nums[i]*nums[i]); 
        }
        Arrays.sort(sarray);
        return sarray;
    }
}