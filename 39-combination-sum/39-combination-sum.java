class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> outer = new ArrayList<>();
            helperCombinationSum(0,candidates,target,outer,new ArrayList<>());
            return outer;
    }
        static void  helperCombinationSum(int idx,int[] candidates,int target,List<List<Integer>> outer,List<Integer> inner){
                if(idx == candidates.length){
                if(target == 0){
                        outer.add(new ArrayList<>(inner));
                       
                }
                         return;
                }
                
                if(candidates[idx] <= target){
                        inner.add(candidates[idx]);
                        helperCombinationSum(idx,candidates,target-candidates[idx],outer,inner);
                        inner.remove(inner.size()-1);
                }
                 helperCombinationSum(idx+1,candidates,target,outer,inner);
        }
}