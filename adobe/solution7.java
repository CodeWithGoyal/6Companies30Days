class GfG
{
	public static int maxCoins(int A[],int n)
	{
          //add code here.
        //   return helper(A,n,0,A.length - 1);
        int dp[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            dp[i][i] = A[i];
        }

        for(int len = 1; len < n; len++){
            for(int i = 0; len + i < n; i++){
                int j = i + len;
                if(len == 1){
                    dp[i][j] = Math.max(A[i],A[j]);
                    continue;
                }
                dp[i][j] = Math.max(A[i] + Math.min(dp[i+2][j],dp[i+1][j -1]),
                                A[j] + Math.min(dp[i+1][j-1],dp[i][j-2]));
                // System.out.println(i + "  " + j + "  " + dp[i][j]);
            }
        }
        return dp[0][n-1];
    }
    // public static int helper(int arr[], int n, int start,int end){
    //     if(start == end) return arr[start];
    //     if(end == start + 1) return Math.max(arr[start],arr[end]);
    //     return Math.max(arr[start] + Math.min(helper(arr,n,start + 2,end) , helper(arr,n,start+1,end -1)),
    //             arr[end] + Math.min(helper(arr,n,start + 1,end -1),helper(arr,n,start,end - 2)));
    // }
}
// https://practice.geeksforgeeks.org/problems/pots-of-gold-game/1/