class Solution
{
	static int[] findSmallestRange(int[][] KSortedArray,int n,int k)
	{
	    //add your code here
	    PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
	        public int compare(int[]a, int[]b){
	            return a[0] - b[0];
	           }
	       });
	   int max = -1;
	    for(int i = 0; i < k; i++){
	        int arr[] = {KSortedArray[i][0], i,0};
	        pq.add(arr);
	        max = Math.max(KSortedArray[i][0], max);
	    }
	    int[] res = new int[2];
	    int range = Integer.MAX_VALUE;
	    while(pq.peek()[2] <= n-1){
	        if(max - pq.peek()[0] < range){
	            res[0] = pq.peek()[0];
	            res[1] = max;
	            range = max - pq.peek()[0];
	        }
	        if(pq.peek()[2] == n-1) break;
	        int i = pq.peek()[1];
	        int j = pq.peek()[2];
	        pq.remove();
	        int arr[] = {KSortedArray[i][j+1], i,j+1};
	        pq.add(arr);
	        max = Math.max(max,KSortedArray[i][j+1]);
	        
	    }
	    return res;
	}
}
// https://practice.geeksforgeeks.org/problems/find-smallest-range-containing-elements-from-k-lists/1/