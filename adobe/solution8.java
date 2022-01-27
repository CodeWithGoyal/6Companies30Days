class Solution
{
    int atoi(String str) {
	// Your code here
	    int ans = 0;
	    for(int i = 0; i < str.length(); i++){
	        int digit = str.charAt(i) - '0';
	        if(digit >= 0 && digit <= 9){
	            ans = ans*10 + digit;
	        }
	        else if(str.charAt(i) == '-'){
	           
	        }
	        else{
	            return -1;
	        }
	    }
	    if(str.charAt(0) == '-'){
	        ans *= -1;
	    }
	    return ans;
    }
}
// https://practice.geeksforgeeks.org/problems/implement-atoi/1/