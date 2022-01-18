class Solution{
    static int isValid(int mat[][]){
        // code here
        
        for(int i = 0; i < 9; i++){
            int arr[] = new int[10];
            for(int j = 0; j < 9; j++){
                if(mat[i][j] != 0 && arr[mat[i][j]] != 0) return 0;
                arr[mat[i][j]]++;
            }
        }
        for(int j = 0; j < 9; j++){
            int arr[] = new int[10];
            for(int i = 0; i < 9; i++){
                if(mat[i][j] != 0 && arr[mat[i][j]] != 0) return 0;
                arr[mat[i][j]]++;
            }
        }
        for(int col = 3; col <= 9; col += 3){
            for(int row = 3; row <= 9; row+=3){
                int arr[] = new int[10];
                for(int i = row - 3; i < row; i++){
                    for(int j = col - 3; j < col; j++){
                        if(mat[i][j] != 0 && arr[mat[i][j]] != 0) {
                            // System.out.println(row +"  " + col + "  " + i + "  " + j);
                            return 0;
                        }
                        arr[mat[i][j]]++;
                    }
                }
            }
        }
        return 1;
    }
}
// https://practice.geeksforgeeks.org/problems/is-sudoku-valid4820/1/