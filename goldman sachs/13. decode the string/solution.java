class Solution{
    static String decodedString(String s){
        // code here
        return helper(s);
    }
    static String subStr(String str, int times){
        String res = "";
        for(int i = 0; i < times; i++) res += str;
        return res;
    }
    static String helper(String s){
        int i = 0, j = 0;
        while(i < s.length() && s.charAt(i) != ']'){
            i++;
        }
        j = i - 1;
        while(j >= 0 && s.charAt(j) != '['){
            j--;
        }
        int k = j - 1;
        while(k >= 0 && Character.isDigit(s.charAt(k))){
            k--;
        }
        if(i == s.length() -1){
            return subStr(s.substring(j+1,i), Integer.parseInt(s.substring(k+1, j)));
        }
        else{
            return helper(s.substring(0,k+1) + subStr(s.substring(j+1,i), Integer.parseInt(s.substring(k+1, j))) + s.substring(i + 1, s.length()));
        }
    }
}
// https://practice.geeksforgeeks.org/problems/decode-the-string2444/1