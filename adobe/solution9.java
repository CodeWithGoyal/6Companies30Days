public class Solution
{
    public String nextPalin(String N) 
    { 
        //complete the function here
        int len = N.length();
        int mid = (len - 1 ) / 2;

        String res = helper(N.substring(0,mid+1), len % 2 == 0?mid:mid-1);
        return res;
    }
    public String helper(String str, int lastIndex){
        char ch[] = str.toCharArray();
        int i = -1;
        for(i = lastIndex - 1; i >= 0 && str.charAt(i) >= str.charAt(i + 1); i--){
            
        }
        if(i < 0) return "-1";
        int j = i;
        for(j = i+1; j <= lastIndex && str.charAt(j) > str.charAt(i); j++);
        char temp = ch[j-1];
        ch[j-1] = ch[i];
        ch[i] = temp;
        Arrays.sort(ch,i+1,lastIndex+1);
        String res = String.valueOf(ch);
        StringBuilder sb = new StringBuilder(String.valueOf(ch,0,lastIndex+1));
        sb.reverse();
        return res + sb.toString();
    }
}
// https://practice.geeksforgeeks.org/problems/next-higher-palindromic-number-using-the-same-set-of-digits5859/1/
