// https://practice.geeksforgeeks.org/problems/longest-arithmetic-progression1019/1/
class Solution {
    int lengthOfLongestAP(int[] A, int n) {
        // code here
        int max = 1;
        HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(i,new HashMap<>());
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                int diff = A[i] - A[j];
                map.get(i).put(diff,map.get(j).getOrDefault(diff,0)+ 1);
                max = Math.max(max,map.get(i).get(diff)+1);
            }
            // System.out.println(max);
        }
        return max;
    }
}