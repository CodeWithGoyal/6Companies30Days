class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        Stack<Integer> stack = new Stack<>();
        String res = "";
        for(int i = 0; i <= S.length(); i++){
            stack.push(i+1);
            if(i == S.length() || S.charAt(i) == 'I'){
                while(stack.isEmpty() == false){
                    res += String.valueOf(stack.pop()) ;
                }
            }
        }
        return res;
    }
}
// https://practice.geeksforgeeks.org/problems/number-following-a-pattern3126/1