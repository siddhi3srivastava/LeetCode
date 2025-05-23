/* Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place. */

//time-complexity: O(N^2)

class Solution {
    public void setZeroes(int[][] matrix) {
        int n= matrix.length;
        int m=matrix[0].length;

        int[] row= new int[n];
        int[] col= new int[m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}
