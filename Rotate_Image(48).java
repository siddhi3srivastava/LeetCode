/* You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation. */


//time-complexity: O(n*n)

class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0; i<row; i++){
            for(int j=i; j<col; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<row/2; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][row-1-j];
                matrix[i][row-1-j]=temp;
            }
        }
    }
}
