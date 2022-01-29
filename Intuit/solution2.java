https://practice.geeksforgeeks.org/problems/word-search/1/
class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(helper(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean helper(char board[][], String word, int i , int j, int ind){
        if(ind == word.length()){
            return true;
        }
        if(i >= board.length || j >= board[0].length || i < 0 || j < 0 || board[i][j] != word.charAt(ind)){
            // System.out.println(i + "  " + j );
            return false;
        }
        board[i][j] = '#';
        int directions[][] = {{0,1},{1,0},{-1,0},{0,-1}};
        boolean res = false;
        for(int[] direction : directions){
            if(helper(board,word,i + direction[0], j + direction[1],ind + 1)){
                res = true;
                break;
            }
        }
        board[i][j] = word.charAt(ind);
        return res;
    }
}