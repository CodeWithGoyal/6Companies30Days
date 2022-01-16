class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        List<String> pad = new ArrayList<>();
        pad.add("");
        pad.add("");
        pad.add("abc");
        pad.add("def");
        pad.add("ghi");
        pad.add("jkl");
        pad.add("mno");
        pad.add("pqrs");
        pad.add("tuv");
        pad.add("wxyz");
        ArrayList<String> res = new ArrayList<>();
        helper(a,N,pad,res,"",0);
        return res;
    }
    static void helper(int a[], int n, List<String> pad,ArrayList<String> res, String temp, int ind){
        if(ind == n){
            res.add(temp);
            return;
        }
        for(int i = 0; i < pad.get(a[ind]).length(); i++){
            String s = temp + pad.get(a[ind]).charAt(i);
            helper(a,n,pad,res,s,ind+1);
        }
    }
}



// https://practice.geeksforgeeks.org/problems/possible-words-from-phone-digits-1587115620/1/