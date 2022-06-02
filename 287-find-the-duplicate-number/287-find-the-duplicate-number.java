class Solution {
    public int findDuplicate(int[] nums) {
       
        int n = nums.length;
        int ans =0;
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            if(arr[nums[i]]==0){
            arr[nums[i]]=1 ;
            }else{
                ans=nums[i];
            }
        }
        return ans;
    }
   
}