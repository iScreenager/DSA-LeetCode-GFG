class Solution {
    public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            helperPermute(0,nums,ans);
            return ans;
        
    }
        public void helperPermute(int ind,int[] nums,List<List<Integer>> ans){
                if(ind == nums.length){
                       ArrayList<Integer> inner = new ArrayList<>();
                        for(int i=0;i<nums.length;i++){
                                inner.add(nums[i]);
                        }
                        ans.add(inner);
                        return;
                }
                
                for(int i=ind;i<nums.length;i++){
                 swap(ind,i,nums);
                        helperPermute(ind+1,nums,ans);
                        swap(ind,i,nums);
                }
        }
        private void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}