class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int i = 0; i < weights.length; i++){
            low = Math.max(low,weights[i]);
            high += weights[i];
        }
        
        int res = Integer.MAX_VALUE;
        while(high >= low){
            int mid = (high + low)/2;
            if(isWalid(weights,days,mid)){
                res = Math.min(res,mid);
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }
    public boolean isWalid(int[] weights,int days, int capacity){
        int sum = 0;
        for(int i = 0; i < weights.length; i++){
            sum += weights[i];
            if(sum > capacity){
                sum = 0;
                i--;
                days--;
            }
            if(days <= 0 && i != weights.length-1){
                return false;
            }
        }
        return true;
    }
}
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/