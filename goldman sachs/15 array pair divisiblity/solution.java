class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        if(nums.length % 2 != 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        int pairs = 0;
        for(int i = 0; i < nums.length; i++){
            int rem = nums[i] % k;
            if(map.containsKey(k - rem) && map.get(k - rem) > 0){
                pairs++;
                map.put(k - rem,map.get(k-rem) -1);
            }
            else{
                map.put(rem,map.getOrDefault(rem,0) + 1); 
            }
        }
        pairs += map.getOrDefault(0,0)/2;
        if(pairs*2 == nums.length){
            return true;
        }
        return false;
    }
}
// https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1