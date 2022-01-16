class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int res[] = new int[2];
        for(int i = 0; i < n; i++){
            if(arr[Math.abs(arr[i])-1] < 0){
                res[0] = Math.abs(arr[i]);
            }
            else{
                arr[Math.abs(arr[i]) -1] *= -1;
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > 0 ){
                res[1] = i+1;
                break;
            }
        }
        return res;
    }
}
// https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1/