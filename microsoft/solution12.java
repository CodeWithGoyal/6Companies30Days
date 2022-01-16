class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(i == 0 || arr[i] != arr[i-1]){
                for(int j = i+1; j < arr.length; j++){
                    if(j == i + 1 || arr[j] != arr[j-1]){
                        int left = j+1;
                        int right = arr.length -1;
                        while(left < right){
                            int sum = arr[i] + arr[j] + arr[left] + arr[right];
                            if(sum > k){
                                right--;
                            }
                            else if(sum < k){
                                left++;
                            }
                            else{
                                ArrayList<Integer> list = new ArrayList<>();
                                list.add(arr[i]);
                                list.add(arr[j]);
                                list.add(arr[left]);
                                list.add(arr[right]);
                                res.add(new ArrayList(list));
                                // System.out.println(i + "  " + j+ "  " + left + "  "+right);
                                // res.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                                while(left < right && arr[left +1] == arr[left]) left++;
                                left++;
                                while(left < right && arr[right -1] == arr[right]) right--;
                                right--;
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
// https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1