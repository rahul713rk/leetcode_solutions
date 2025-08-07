class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n];
        for (int i =0 ; i<n ; i++){
            dp[i] = -1;
        }
        return dfs(n, 0);
    }

    private int dfs(int n , int i){
        if (n==i) return 1;
        if (n<i) return 0;
        if (dp[i] != -1) return dp[i];
        return dp[i] = dfs(n , i+1) + dfs(n ,i+2);
    }
}