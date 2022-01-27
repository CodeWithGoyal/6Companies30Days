// https://practice.geeksforgeeks.org/problems/express-as-sum-of-power-of-natural-numbers5647/1
class Solution
{
    static int numOfWays(int n, int x)
    {
        // code here
        int limit = (int)Math.pow(n,1.0/x);
        long mod = 1000000007;
        long dp[][] = new long[n + 1][limit + 1];
        for(int i = 0; i <= limit; i++){
            dp[(int)Math.pow(i,x)][i] = 1;
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= limit; j++){
                if(i == 1 && j == 1) continue;
                dp[i][j] += dp[i][j-1] % mod;
                if(Math.pow(j,x) <= i){
                    dp[i][j] += dp[i - (int)Math.pow(j,x)][j-1] % mod;
                    dp[i][j] = dp[i][j] % mod;
                }
                // System.out.print(dp[i][j] + "  ");
            }
            // System.out.println();
        }
        return (int)dp[n][limit];
    }
}