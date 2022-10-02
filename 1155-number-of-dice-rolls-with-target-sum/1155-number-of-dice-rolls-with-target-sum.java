class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        return solveMem(n, k, target, dp);
    }

    int mod = 1000000007;
    public int solveMem(int n, int k, int target, int[][] dp){
        if(target < 0) return 0;

        if(n == 0 && target != 0) return 0;

        if(n == 0 && target == 0) return 1;

        if(target == 0 && n != 0) return 0;

        if(dp[n][target] != -1) return dp[n][target];

        int sum = 0;
        for(int i = 1; i <= k; i++){
            sum = ((sum)%mod + (solveMem(n - 1, k, target - i, dp))%mod)%mod;
        }

        return dp[n][target] = sum;
    }
}