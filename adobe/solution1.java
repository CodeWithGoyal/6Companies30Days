class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int i = 0;
        int sum = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int j = 0; j < n; j++){
            sum += arr[j];
            while(sum > s){
                sum -= arr[i++];
            }
            if(sum == s){
                res.add(i+1);
                res.add(j+1);
                break;
            }
        }
        if(res.isEmpty()){
            res.add(-1);
        }
        return res;
    }
}
// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1