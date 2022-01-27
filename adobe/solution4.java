class Solution{
    // static int isExist(int N, int arr[],int sum){
    //     if(sum == 0) return 1;
    //     // if(sum < 0) return 0;
    //     if(N==0) return 0;
    //     int res = isExist(N-1,arr,sum);
    //     if(sum >= arr[N-1])
    //     res = Math.max(res,isExist(N-1,arr,sum-arr[N-1]));
    //     return res;
    // }
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += arr[i];
        }
        if(sum % 2 != 0) return 0;
        sum /=2;
        int dp[][] = new int[sum+1][N+1];
        for(int i = 0; i <= N; i++){
            dp[0][i] = 1;
        }
        for(int i = 1; i <= sum; i++){
            for(int j = 1; j <= N; j++){
                dp[i][j] = dp[i][j-1];
                if(i >= arr[j-1]){
                    dp[i][j] = Math.max(dp[i][j],dp[i-arr[j-1]][j-1]);
                }
            }
        }
        return dp[sum][N];
    }
}
https://practice.geeksforgeeks.org/problems/subset-sum-problem2014/1