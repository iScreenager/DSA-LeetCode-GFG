class Solution {
    public boolean isPerfectSquare(int num) {
   
        int temp = num;
        
        for(int i=1;temp>0;i+=2){
            temp -= i;
        }
       if(temp ==0){
           return true;
       } else{
           return false;
       }
        
    }
}