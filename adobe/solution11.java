class Solution{
    public String amendSentence(String s){
        //code here
        StringBuilder res = new StringBuilder();
        res.append(s);
        if(s.charAt(0) < 97){
            res.setCharAt(0,(char)(s.charAt(0) + 32));
        }
        // System.out.println(res);
        int spaces = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) < 97){
                res.insert(i + spaces," ");
                spaces++;
                res.setCharAt(i + spaces , (char)(s.charAt(i) + 32));
            }
        }
        return res.toString();
    }
}
// https://practice.geeksforgeeks.org/problems/amend-the-sentence3235/1