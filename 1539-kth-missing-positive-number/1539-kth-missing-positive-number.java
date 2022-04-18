class Solution {
    public int findKthPositive(int[] arr, int k) {
            ArrayList<Integer> dummyArr = new ArrayList<>();
            
            int i=0;
            int addElm = 0;
            int num = 1;
            
            while(addElm <= k && i < arr.length){
                    
                    if(num != arr[i]){
                           
                            dummyArr.add(num);
                             addElm++;
                            num++;
                           
                            
                           
                    }else{
                            
                            i++;
                             num++;
                            
                            
                    }
            }
            
            while(addElm <= k){
                     dummyArr.add(num);
                            num++;
                            addElm++;
                            
            }
            return dummyArr.get(k-1);
            
        
    }
}