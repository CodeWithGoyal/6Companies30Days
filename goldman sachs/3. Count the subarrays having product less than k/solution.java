class GfG
 {
	String encode(String str)
	{
          //Your code here
          String res = "";
          int n = str.length();
          int count = 1;
          for(int i = 0; i < n; i++){
              if(i == n-1 || str.charAt(i) != str.charAt(i+1)){
                  res += str.charAt(i) + String.valueOf(count);
                  count = 1;
              }
              else{
                  count++;
              }
          }
          
          return res;
	}
	
 }
//  https://practice.geeksforgeeks.org/problems/run-length-encoding/1/