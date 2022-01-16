class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0, j = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum >= target){
                min = Math.min(min,i - j+1);
                while(j < i && sum >= target){
                    sum -= nums[j++];
                    if(sum >= target){
                        min = Math.min(min,i - j +1);
                    }
                }
            }
        }
        return min == Integer.MAX_VALUE?0:min;
    }
}
// https://leetcode.com/problems/minimum-size-subarray-sum/