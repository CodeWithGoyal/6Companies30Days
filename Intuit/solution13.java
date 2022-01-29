class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int tzeros[] = new int[n];
        for(int i = 0; i < n; i++){
            int zeros = 0;
            for(int j = n - 1; j >= 0 && grid[i][j] == 0; j--){
                zeros++;
            }
            tzeros[i] = zeros;
        }
        int res = 0;
        for(int i = 0; i < n; i++){
            int req = n - i - 1;
            int curr = i;
            while(curr < n && tzeros[curr] < req) curr++;
            if(curr == n) return -1;
            
            res += curr - i;
            for(int j = curr; j > 0; j--){
                tzeros[j] = tzeros[j-1];
            }
        }
        return res;
    }
}
// https://leetcode.com/problems/minimum-swaps-to-arrange-a-binary-grid/