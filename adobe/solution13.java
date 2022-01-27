// https://practice.geeksforgeeks.org/problems/minimum-insertions-to-make-two-arrays-equal/1/
class Solution {
    static int minInsAndDel(int[] A, int[] B, int N, int M) {
        // code here
        int dp[][] = new int[2][M+1];
        int x = 0;
        int y = 1;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= M; j++){
                if(i % 2 == 0){
                    x = 1;
                    y = 0;
                }
                else{
                    x = 0;
                    y = 1;
                }
                if(A[i-1] == B[j-1]){
                    dp[y][j] = dp[x][j-1]+1;
                }
                else{
                    dp[y][j] = Math.max(dp[x][j] , dp[y][j-1]);
                }
            }
        }
        return N - 2*dp[y][M] + M;
    }
};