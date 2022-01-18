class Solution {
    static int maxProfit(int K, int N, int A[]) {
        // code here
        int dp[][] = new int[N+1][K+1];

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= K; j++){
                for(int k = i-1; k >= 1; k--){
                    if(A[k-1] < A[i-1]){
                        dp[i][j] = Math.max(dp[i][j],dp[k-1][j-1] + A[i-1] - A[k-1]);
                    }
                }
                dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
                // System.out.print(dp[i][j] + "  ");
            }
            // System.out.println();
        }
        
        return dp[N][K];
    }
   
}
// https://practice.geeksforgeeks.org/problems/maximum-profit4657/1