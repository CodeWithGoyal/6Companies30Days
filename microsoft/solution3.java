class GFG
{
    static void rotate(int matrix[][]) 
    {
        // Code Here
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < n/2; i++){
            for(int j = 0; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1-i][j];
                matrix[n-1-i][j] = temp;
            }
        }
    }
}
// https://practice.geeksforgeeks.org/problems/rotate-by-90-degree0356/1/