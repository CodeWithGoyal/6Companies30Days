
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer,HashMap<Double,Integer>> map = new HashMap<>();
        int res = 0;
        for(int i = 0; i < points.length; i++){
            map.put(i,new HashMap<>());
            for(int j = 0; j < points.length; j++){
                double distance = Math.sqrt(Math.pow(points[i][0] - points[j][0],2) + Math.pow(points[i][1] - points[j][1],2));
                map.get(i).put(distance,map.get(i).getOrDefault(distance,0) + 1);
            }
            for(Map.Entry<Double,Integer> e : map.get(i).entrySet()){
                int val = e.getValue();
                if(val >= 2){
                    res += val * (val - 1); 
                }
            }
        }
        return res;
    }
}
// https://leetcode.com/problems/number-of-boomerangs/