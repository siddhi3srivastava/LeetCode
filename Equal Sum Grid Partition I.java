// leetcode weekly contest 
//question 2

/*You are given an m x n matrix grid of positive integers. Your task is to determine if it is possible to make either one horizontal or one vertical cut on the grid such that:

Each of the two resulting sections formed by the cut is non-empty.
The sum of the elements in both sections is equal.
Return true if such a partition exists; otherwise return false.

 ©leetcode */

class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int total=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                total+=grid[i][j];
            }
        }

        int row_sum=0;
        for(int i=0; i<m-1; i++){
            for(int j=0; j<n; j++){
                row_sum+=grid[i][j];
            }
            if(row_sum==total-row_sum){
                return true;
            }
        }

        int[] col_sum= new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                col_sum[i]+=grid[j][i];
            }
        }

        int left_sum=0;
        for(int i=0; i<n-1; i++){
            left_sum+=col_sum[i];
            if(left_sum==total-left_sum){
                return true;
            }
        }

        return false;
        
    }
}©leetcode
