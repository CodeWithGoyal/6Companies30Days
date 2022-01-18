
class Solution
{
    String colName (long n)
    {
        // your code here
        String res = "";
        while(n != 0){
            n--;
            int rem = ((int)n % 26) +'A';
            res = (char)rem + res; 
            n/= 26;
        }
        return res;
    }
}
// https://practice.geeksforgeeks.org/problems/column-name-from-a-given-column-number4244/1/