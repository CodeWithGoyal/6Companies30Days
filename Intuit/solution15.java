class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < piles.length;i++){
            sum += piles[i];
            max = Math.max(max,piles[i]);
        }
        int low = (int)Math.ceil((double)sum / h);
        int res = Integer.MAX_VALUE;
        while(low <= max){
            int mid = (low + max)/2;
            if(check(piles,h,mid)){
                res = Math.min(res,mid);
                max = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }
    public boolean check(int[] piles, int h,int capacity){
        for(int i = 0; i < piles.length; i++){
            h -= (int)Math.ceil((double)piles[i] / capacity);
            if(h <= 0 && i != piles.length - 1){
                return false;
            }
            if(i == piles.length - 1 && h < 0){
                return false;
            }
        }
        return true;
    }
}
// https://leetcode.com/problems/koko-eating-bananas/