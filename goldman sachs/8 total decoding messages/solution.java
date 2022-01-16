class Solution
{
    public int CountWays(String str)
    {
        // code here
        // return helper(str,str.length() - 1);
        int mod = 1000000007;
        long dp[] = new long[str.length() + 1];
        if(str.charAt(0) == '0'){
            return 0;
        }
        dp[0] = 1L;
        dp[1] = 1L;
        int count = 0;
        for(int i = 2; i < dp.length; i++){
            if(str.charAt(i-1) != '0'){
                dp[i] += dp[i-1] % mod;
                dp[i] = dp[i] % mod;
            }
            if(str.charAt(i-2) != '0' && Integer.parseInt(str.substring(i - 2, i)) <= 26){
                dp[i] += dp[i - 2] % mod;
                dp[i] = dp[i] % mod;
            }
        }
        return (int)dp[dp.length - 1];
    }
    // public int helper(String str, int ind){
    //     if(ind == 0 && str.charAt(0) == '0') return 0;
    //     if(ind <= 0) return 1;
    //     int res = 0;
    //     if(str.charAt(ind) != '0'){
    //         res += helper(str,ind -1);
    //     }
    //     if(str.charAt(ind - 1 ) != '0' && Integer.parseInt(str.substring(ind -1,ind+1)) <= 26){
    //         res += helper(str,ind - 2);
    //     }
    //     return res;
    // }
}
// https://practice.geeksforgeeks.org/problems/total-decoding-messages1235/1/