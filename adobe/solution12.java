class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        int[] maxArr = new int[n];
        int max = arr[n-1];
        for(int i = n-1; i >= 0; i--){
            maxArr[i] = max;
            if(arr[i] > max){
                max = arr[i];
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(arr[i] >= maxArr[i]){
                ans.add(arr[i]);
            }
        }

        return ans;
    }
}
// https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1/