class Solution {
    public int fib(int n) {
int[] dp = new int[n+1];
            Arrays.fill(dp,-1);
            return helperFib(n,dp);
    }
        
        public int helperFib(int n, int[] dp){
                if(n<=1) return n;
                
                if(dp[n] != -1) return dp[n];
            
            int lh = helperFib(n-1,dp);
                int rh = helperFib(n-2,dp);
                
                return dp[n]=lh+rh;
        }
}