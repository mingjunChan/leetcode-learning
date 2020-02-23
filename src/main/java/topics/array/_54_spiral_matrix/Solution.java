package topics.array._54_spiral_matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/spiral-matrix/
 */
public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if (matrix==null||matrix.length==0){
            return new ArrayList<Integer>();
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int nums = rows * cols;
        int directions[][] = new int[][]{
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
        };

        int rd = 0;
        int rc = 0;
        int x = 0;
        int y = 0;
        int k = 0;
        rows = rows - 1;
        result.add(matrix[x][y]);
        for (int i = 0; i < nums-1; i++) {

            //偶数横向
            if (k % 2 == 0) {
                rd++;
            } else {
                rc++;
            }
            if (rd == cols&&cols!=0) {
                rd = 0;
                k=(k+1)%4;
                cols--;
            }
            if (rc == rows&&rows!=0) {
                rc = 0;
                k=(k+1)%4;
                rows--;
            }

            x = x + directions[k][0];
            y = y + directions[k][1];
            result.add(matrix[x][y]);

        }

        return result;
    }

}
