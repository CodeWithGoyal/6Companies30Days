class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int sum = 0; 
	    for(int x : arr){
	        sum += x;
	    }
	    int sum1 = sum / 2;
	   // int sum2 = 0;
	    int dp[][] = new int[n+1][sum1+1];
	    for(int i = 1; i <= n; i++){
	        for(int j = 1; j <= sum1;j++){
	           // dp[i][j] = Integer.MAX_VALUE;
	            if(j - arr[i-1] >= 0){
	                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-arr[i-1]] + arr[i - 1]);
	            }
	            else{
	                dp[i][j] = dp[i-1][j];
	            }
	           // System.out.print(dp[i][j] + "  ");
	        }
	       // System.out.println();
	    }
	    return (sum - 2 *dp[n][sum1]);
	} 
}