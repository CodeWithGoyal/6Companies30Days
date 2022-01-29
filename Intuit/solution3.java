class GfG
{
	public int missingNumber(String s)
    {
       //add code here.
       for(int len = 1; len <= 6; len++){
           int n = getIntValue(s,0,len-1);
           int missingNumber = -1;
           boolean fail = false;
           n++;
          for(int i = len; i < s.length(); i= i + (int)Math.log10((double)n-1)+1){
            //   System.out.println(len + "  " + i);
               if(missingNumber == -1 && getIntValue(s,i,i+(int)Math.log10((double)n+1)) == n+1){
                   missingNumber = n ;
                   n = n + 1;
                   
               }
               else if(getIntValue(s,i,i+(int)Math.log10((double)n)) == n){
                //   System.out.println(len + "  " + n);
               }
               else{
                   fail = true;
                //   System.out.println(len + "  " + i + "  " + n);
                  break;
               }
               
               n++;
           }
           if(!fail){
               return missingNumber;
           }
           
       }
       return -1;
    }
    public int getIntValue(String str,int firstIndex,int lastIndex){
        if(lastIndex >= str.length()){
            return -1;
        }
        int res = 0;
        for(int i = firstIndex; i <= lastIndex; i++){
            res = res*10 + (str.charAt(i) -'0');
        }
        return res;
    }
}
// https://practice.geeksforgeeks.org/problems/find-the-missing-no-in-string/1/