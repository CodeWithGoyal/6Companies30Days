class Solution {
    public int splitArray(int[] nums, int m) {
        int preSum[] = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            preSum[i] = sum;
        }
        int dp[][] = new int[m][nums.length + 1];
        for(int i = 1; i <= nums.length; i++){
            dp[0][i] = preSum[i-1];
        }
        for(int i = 0; i < m; i++){
            dp[i][0] = nums[0];
        }
        for(int i = 1; i < m; i++){
            for(int j = 2; j <= nums.length; j++){
                dp[i][j] = Integer.MAX_VALUE;
                for(int n = 1; n < j; n++){
                    dp[i][j] = Math.min(dp[i][j],Math.max(dp[i-1][n], preSum[j-1] - preSum[n-1]));
                }
            }
        }
        return dp[m - 1][nums.length];
    }
}
// https://leetcode.com/problems/split-array-largest-sum/