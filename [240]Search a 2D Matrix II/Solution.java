public class Solution {
    public boolean searchMatrix(int [][] matrix,int target) {
        if(matrix == null || matrix.length == 0) return false;
          
        int rows = matrix.length;
        int cols = matrix[0].length;
          
        int i = 0, j = cols - 1;
        while(i >= 0 && i < rows && j >= 0 && j < cols) {
            if(matrix[i][j] == target) {
                return true;
            }
            else if(matrix[i][j] < target) {
                i++;
            }
            else {
                j--;
            }
        }
         
        return false;
    }
}
