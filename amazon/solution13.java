class Solution {
    public int orangesRotting(int[][] grid) {
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    int dist = dfs(grid,i , j);
                    if(dist >= 100000){
                        return -1;
                    }
                    res = Math.max(res,dist);
                }
            }
        }
        return res;
    }
    public int dfs(int[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || grid[i][j] == -1){
            return 100000;
        }
        if(grid[i][j] == 2){
            return 0;
        }
        grid[i][j] = -1;
        int directions[][] = {{0,1}, {1,0},{-1,0},{0,-1}};
        int res = 10000000;
        for(int direction[]: directions){
            res = Math.min(res, 1 + dfs(grid,i + direction[0],j + direction[1]));
        }
        grid[i][j] = 1;
        return res;
    }
}
// https://leetcode.com/problems/rotting-oranges/
