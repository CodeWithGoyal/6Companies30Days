// https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1/class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int leftCol = 0, rightCol = c-1,topRow = 0, bottomRow = r-1;
        int visited = 0;
        ArrayList<Integer> res = new ArrayList<>();
        // try{
            while(visited < r*c){
                int i = topRow, j = leftCol;
                while(visited < r*c && j < rightCol){
                    res.add(matrix[i][j++]);
                    visited++;
                }
                while(visited < r*c && i <  bottomRow){
                    res.add(matrix[i++][j]);
                    visited++;
                }
                while(visited < r *c && j > leftCol){
                    res.add(matrix[i][j--]);
                    visited++;
                }
                while(visited < r*c && i > topRow){
                    res.add(matrix[i--][j]);
                    visited++;
                }
                topRow++;
                leftCol++;
                rightCol--;
                bottomRow--;
                if(topRow == bottomRow && leftCol == rightCol){
                    res.add(matrix[topRow][leftCol]);
                    visited++;
                }
            }
                
        // } catch(Exception e){
            
        // }
        
        return res;
    }
}
