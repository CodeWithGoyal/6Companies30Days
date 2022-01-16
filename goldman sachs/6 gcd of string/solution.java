class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String res = "";
        for(int len = 1; len <= str2.length(); len++){
            String sub = str2.substring(0,len);
            int m = str1.length();
            int n = str2.length();
            if(m % len != 0 || n %len != 0)continue;
            // System.out.println(len + "  " + sub);
            int i = 0;
            for(i = 0; i + len <= m; i+=len){
                if(!str1.substring(i,i+len).equals(sub)) break;
            }
            if(i != m) continue;
            for( i = 0; i + len <= n; i+= len){
                if(!str2.substring(i,i + len).equals(sub))break;
            }
            if(i != n)continue;
            res = sub;
            // System.out.println(len + "  " + sub);
        }
        return res;
    }
}
// https://leetcode.com/problems/greatest-common-divisor-of-strings/