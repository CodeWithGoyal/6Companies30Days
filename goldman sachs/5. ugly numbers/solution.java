class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        list.add(1L);
        PriorityQueue<Long> pq = new PriorityQueue<>();
        pq.add(2L);
        pq.add(3L);
        pq.add(5L);
        while(list.size() < n){
            long temp = pq.remove();
            while(temp == pq.peek()){
                pq.remove();
            }
            list.add(temp);
            pq.add(temp * 2);
            pq.add(temp*3);
            pq.add(temp*5);
        }
        return list.get(list.size() - 1);
    }
}
// https://practice.geeksforgeeks.org/problems/ugly-numbers2254/1/