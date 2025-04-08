/*Given an integer numRows, return the first numRows of Pascal's triangle.
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
*/

// time-complexity: O(n^2)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        //every [i][0] and [i][j] where j=i element is 1
        //[i][j]=[i-1][j-1]+[i-1][j]

        //using nested for-loop
        List<List<Integer>> outTri= new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> inTri= new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || i==j){
                    inTri.add(1);
                }
                else{
                    inTri.add(outTri.get(i-1).get(j-1)+outTri.get(i-1).get(j));
                }
            }
            outTri.add(inTri);
        }
        return outTri;

    }
}
