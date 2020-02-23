package topics.graph.bfs._542_01_matrix;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        Queue<Integer> queue = new LinkedList<Integer>();

        Set<Integer> isVisit = new HashSet<Integer>();

        int[][] directions = new int[][]{
                {-1, 0},
                {0, 1},
                {1, 0},
                {0, -1}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) continue;

                Integer number = i * cols + j;//二维坐标转换一维坐标；
                queue.add(number);


                while (!queue.isEmpty()) {
                    number = queue.poll();
                    int x = number / cols;
                    int y = number % cols;
                    if (matrix[x][y] == 0) {
                        int dis = Math.abs(x-i)+Math.abs(y-j);
                        matrix[i][j] = dis;

                        queue = new LinkedList<Integer>();
                        isVisit = new HashSet<Integer>();
                        break;
                    }
                    for (int k = 0; k < 4; k++) {
                        int newX = x + directions[k][0];
                        int newY = y + directions[k][1];
                        int newNumber = newX * cols + newY;
                        if (newX<0||newX>=rows||newY<0||newY>=cols||!isVisit.add(newNumber)){
                            continue;
                        }
                        queue.add(newNumber);

                    }

                }
            }
        }

        return matrix;
    }
}