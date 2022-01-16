// https://practice.geeksforgeeks.org/problems/length-of-largest-region-of-1s-1587115620/1/
class Solution
{
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    max = Math.max(max,helper(grid,i,j));
                }
            }
        }
        return max;
    }
    public int helper(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length||j >= grid[0].length || grid[i][j] != 1){
            return 0;
        }
        
        grid[i][j] = 0;
        int res = 1;
        int directions[][] = {{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
        for(int direction[] : directions){
            res += helper(grid,i+direction[0], j + direction[1]);
        }
        return res;
    }
}
