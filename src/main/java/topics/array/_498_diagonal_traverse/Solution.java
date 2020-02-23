package topics.array._498_diagonal_traverse;

/**
 * https://leetcode-cn.com/problems/diagonal-traverse/
 * 对角线遍历，有个隐含条件M==N，因为M！=N，则坐标不落在对角线上，即不存在对角线遍历
 */
public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return new int[]{};
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows * cols];
        int r = 0, c = 0, flag = 1;//方向，1up，-1down
        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[r][c];
            if ((r + c) % 2 == 0) {

                if (c == cols - 1) {
                    r++;
                } else if (r == 0) {
                    c++;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == rows - 1) {
                    c++;
                } else if (c == 0) {
                    r++;
                } else {
                    r++;
                    c--;
                }
            }

        }
        return result;
    }

}



