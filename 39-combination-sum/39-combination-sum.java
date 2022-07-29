class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> outer = new ArrayList<>();
             
            helper(0,candidates,target,outer,new ArrayList<>());
            return outer;
        
    }
        public void helper(int ind,int[] candidates,int target,List<List<Integer>> outer,            List<Integer> inner){
                if(ind == candidates.length){
                        if(target == 0){
                                outer.add( new ArrayList<>(inner));
                        }
                        return;
                }
                
                if(candidates[ind] <= target){
                        inner.add(candidates[ind]);
                        helper(ind,candidates,target-candidates[ind],outer,inner);
                        inner.remove(inner.size()-1);
                }
                helper(ind+1,candidates,target,outer,inner);
        }
}