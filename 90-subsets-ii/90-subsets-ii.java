class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());
            
            int s = 0;
            int e = 0;
            
            for(int i=0;i<nums.length;i++){
                    s=0;
                    if(i>0 && nums[i] == nums[i-1]){
                            s= e+1;
                    }
                    
                    e= outer.size()-1;
                    int n = outer.size();
                    
                    for(int j=s;j<n;j++){
                            List<Integer> internal = new ArrayList<>(outer.get(j));
                            internal.add(nums[i]);
                            outer.add(internal);
                    }
            }
            return outer;
        
    }
}