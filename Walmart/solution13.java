class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<>(){
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }
                else{
                    return s1.length() -  s2.length();
                }
            }
        });
        for(int i = 0; i < k; i++){
            pq.add(nums[i]);
        }
        for(int i = k; i < nums.length; i++){
            if(nums[i].length() > pq.peek().length()){
                pq.remove();
                pq.add(nums[i]);
            }
            else if(nums[i].length() == pq.peek().length() && nums[i].compareTo(pq.peek()) > 0){
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}
// https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/