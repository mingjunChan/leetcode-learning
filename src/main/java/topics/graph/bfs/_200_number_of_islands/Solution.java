package topics.graph.bfs._200_number_of_islands;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    /**
     *
     *
     */
    public int numIslands(char[][] grid) {
        Set<Integer> isMarked = new HashSet<Integer>();
        int rows = grid.length;
        if (rows <= 0) return 0;//排除空数组

        int cols = grid[0].length;
        int result = 0;

        Queue<Integer> queue = new LinkedList<Integer>();//BFS依赖队列辅助

        int directions[][] = {
                {-1, 0},
                {0, 1},
                {1, 0},
                {0, -1}

        };

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                Integer number = i * cols + j;//二维坐标转换一维坐标；

                if (grid[i][j] == '1' && !isMarked.contains(number)) {
                    isMarked.add(number);
                    queue.add(number);
                    result++;
                }
                while (!queue.isEmpty()) {
                    number = queue.poll();
                    int x = number / cols;
                    int y = number % cols;
                    for (int k = 0; k < 4; k++) {
                        int newX = x + directions[k][0];
                        int newY = y + directions[k][1];
                        number = newX * cols + newY;

                        Boolean inArea = isInArea(newX, newY, rows, cols);
                        if (inArea && grid[newX][newY] == '1' && !isMarked.contains(number)) {
                            isMarked.add(number);
                            queue.add(number);
                        }

                    }

                }
            }
        }

        return result;
    }

    boolean isInArea(int x, int y, int rows, int cols) {
        boolean result = x >= 0 && x < rows && y >= 0 && y < cols;


        return result;
    }
}
