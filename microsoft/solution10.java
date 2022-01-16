class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        // return helper(arr,n);
        int dp[] = new int[n+1];
        dp[1] = arr[0];
        for(int i = 2; i <= n; i++){
            dp[i] = Math.max(dp[i-1], dp[i -2] + arr[i-1]);
        }
        return dp[n];
    }
    // public int helper(int arr[], int n){
    //     if(n <= 0) return 0;
    //     if(n == 1) return arr[0];
    //     return Math.max(helper(arr,n-1) , helper(arr,n-2) + arr[n-1]);
    // }
}
// https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1/