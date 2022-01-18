// https://practice.geeksforgeeks.org/problems/deee0e8cf9910e7219f663c18d6d640ea0b87f87/1/
class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(k,(a,b) -> b[0] - a[0]);
        for(int i = 0; i < k-1; i++){
            int[] temp = new int[2];
            temp[0] = arr[i];
            temp[1] = i;
            pq.add(temp);
        }
        for(int i = k-1; i < n; i++){
            int[] temp = new int[2];
            temp[0] = arr[i];
            temp[1] = i;
            pq.add(temp);
            while(pq.peek()[1] < i - k+1){
                pq.remove();
            }
            res.add(pq.peek()[0]);
        }
        return res;
    }
}