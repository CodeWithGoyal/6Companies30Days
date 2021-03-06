class Solution{
    public int kvowelwords(int N,int K){
        // code here
        long dp[][] = new long[N + 1][K + 1];
        long mod = 1000000007;
        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= K; j++){
                if(i == 0) dp[i][j] = 1;
                else {
                    dp[i][j] = (dp[i-1][K] * 21) % mod ;
                    if(j > 0){
                        dp[i][j] = (dp[i][j] + (dp[i-1][j-1] * 5)%mod)%mod;
                    }
                }
            }
        }
        return (int) dp[N][K];
    }
}
// https://practice.geeksforgeeks.org/problems/7b9d245852bd8caf8a27d6d3961429f0a2b245f1/1/