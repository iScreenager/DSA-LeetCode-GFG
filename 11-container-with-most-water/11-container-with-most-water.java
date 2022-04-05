class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while(i<=j){
            int curMax = (j-i)*(int)Math.min(height[j],height[i]);
            max = (int)Math.max(curMax,max);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}