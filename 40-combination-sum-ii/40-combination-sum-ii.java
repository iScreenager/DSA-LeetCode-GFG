class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> outer = new ArrayList<>();
            helperFun(0,candidates,target,outer,new ArrayList<>());
            return outer;
        
    }
        
         static void  helperFun(int idx,int[] arr,int target,List<List<Integer>> outer,List<Integer> inner){
               
                if(target == 0){
                        outer.add(new ArrayList<>(inner));
                
                    return;
                }
                      
                 for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            inner.add(arr[i]);
            helperFun(i + 1, arr, target - arr[i], outer, inner);
            inner.remove(inner.size() - 1);
        }
         }       
               
                
        
        
        
}