// https://practice.geeksforgeeks.org/problems/number-of-unique-paths5339/1/
class Solution
{
    //Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) 
    {
        //Your code here
        return helper(a,b,0,0);
    }
    public static int helper(int a, int b, int i, int j){
        if(i == a - 1 && j == b - 1){
            return 1;
        }
        if(i >= a || j >= b) return 0;
        return helper(a,b,i+1,j) + helper(a,b,i,j+1);
    }
}