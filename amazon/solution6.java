class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return b[0] - a[0];
            }
        });
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int temp[] = new int[2];
            temp[0] = arr[i];
            temp[1] = i;
            pq.add(temp);
            if(i < k - 1) continue;
            while(pq.peek()[1] < i - k + 1){
                pq.remove();
            }
            res.add(pq.peek()[0]);
        }
        return res;
    }
}
// https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1