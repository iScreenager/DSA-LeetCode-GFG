class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }
        int coin = n;
       int i = 1;
        while(coin>0){
            i++;
            coin = coin-i;
        }
        return i-1;
        
    }
}