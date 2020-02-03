package topics.graph.dfs._200_number_of_islands;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    int rows;
    int cols;
    Set<Integer> isMarked;

    public Solution() {
        isMarked = new HashSet<Integer>();
    }

    private void dfs(char[][] grid, int i, int j) {

        if (i < 0 || j < 0 || i >= rows || j >= cols ||grid[i][j]=='0'||isMarked.contains(i * cols + j)) return;
        isMarked.add(i*cols+j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
    }

    public int numIslands(char[][] grid) {

        int result = 0;
        this.rows = grid.length;
        if (rows==0) return 0;
        this.cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Integer number = i * cols + j;//二维坐标转换一维坐标；

                if (grid[i][j] == '1' && !isMarked.contains(number)) {

                    result++;
                }
                dfs(grid, i, j);

            }
        }
        return result;
    }

}
