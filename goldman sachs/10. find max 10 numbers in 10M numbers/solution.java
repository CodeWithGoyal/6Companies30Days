class Solution{
    public ArrayList<Integer> maxNumbers(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>(); // to prevent duplicates in priority queue
        int i = 0;
        while(pq.size()< 10){
            if(!set.contains(arr[i])){
                pq.add(arr[i]);
                set.add(arr[i]);
            }
        }
        while(i < arr.length){
            if(arr[i] > pq.peek() && !set.contains(arr[i])){
                set.remove(pq.remove());
                pq.add(arr[i]);
                set.add(arr[i]);
            }
            i++;
        }
        for( i = 0; i < 10; i++){
            res.add(0,pq.remove());
        }
        return res;
    }
}
