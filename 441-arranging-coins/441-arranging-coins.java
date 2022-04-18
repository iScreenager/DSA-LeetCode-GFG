class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }
      long s = 0;
            long e = n;
            
            while(s <= e){
                    long m = s+(e-s)/2;
                    long currentCoin = m*(m+1)/2;
                    
                    if(n==currentCoin ){
                            return (int)m;
                    }else if(n < currentCoin){
                            e = m-1;
                    }else{
                            s = m+1;
                    }
            }
            return (int)e;
    }
        
}