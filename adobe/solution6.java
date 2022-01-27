class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> res = new ArrayList<>();
        helper(res,"",n,n);
        return res;
    }
    public void helper(List<String> res, String temp,int open, int close){
        if(open == 0 && close == 0){
            res.add(temp);
        }
        if(open != 0){
            helper(res,temp + "(" , open - 1, close);
        }
        if(close > open){
            helper(res,temp + ")",open,close -1);
        }
    }
}
// https://practice.geeksforgeeks.org/problems/generate-all-possible-parentheses/1/