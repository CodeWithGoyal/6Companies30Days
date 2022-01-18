class Solution{
    static String matrixChainOrder(int p[], int n){
        // code here
        int dp[][] = new int[n][n];
        String res[][] = new String[n][n];
        for(int i = 0; i < n-1; i++){
            dp[i][i+1] = 0;
            res[i][i+1] = Character.toString(i + 'A');
        }
        for(int gap = 2; gap < n; gap++){
            for(int i = 0; i + gap < n; i++){
                int j = i + gap;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = i+1; k < j; k++){
                    if(dp[i][j] > dp[i][k] + dp[k][j] + p[i]*p[k]*p[j]){
                        dp[i][j] = dp[i][k] + dp[k][j] + p[i]*p[k]*p[j];
                        res[i][j] = "(" + res[i][k] + res[k][j] + ")";
                    }
                }
                // System.out.println(dp[i][j] + "  " + i + "  " + j + "  " + res[i][j]);
            }
            // System.out.println();
            
        }
        return res[0][n-1];
    }
}
// https://practice.geeksforgeeks.org/problems/brackets-in-matrix-chain-multiplication1024/1/