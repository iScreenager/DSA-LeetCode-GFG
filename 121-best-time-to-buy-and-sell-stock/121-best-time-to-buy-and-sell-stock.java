class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        
        for(int i=1;i<n;i++){
           
            if(prices[i-1]<buy){
                buy = prices[i-1];
            }
            if(prices[i]-buy > maxProfit){
                maxProfit = prices[i]-buy;
            }
        }
        
        if(maxProfit<0){
            return 0;
        }
        return maxProfit;
        
    }
}