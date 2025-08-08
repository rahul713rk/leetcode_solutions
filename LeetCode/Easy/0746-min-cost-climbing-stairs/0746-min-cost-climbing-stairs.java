class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        for (int i =0;i<cost.length;i++){
            dp[i] = -1;
        }
        return Math.min(dfs(cost , 0) , dfs(cost,1));
    }

    private int dfs(int[] cost , int i){
        if (i >= cost.length) return 0;
        if (dp[i] != -1){
            return dp[i];
        }
        return dp[i] = cost[i] + Math.min(dfs(cost , i+1) , dfs(cost , i+2));
    }
}