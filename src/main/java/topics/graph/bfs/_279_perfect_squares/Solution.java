package topics.graph.bfs._279_perfect_squares;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Soltuion {

    public int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<Integer>();//BFS算法专用队列
        Set<Integer> isVisited = new HashSet<Integer>();//BFS算法标记已经遍历过的节点的队列
        int step = 0;//BFS返回步长

        if (n == 0) return step;

        Integer initNode = n;//初始入队列的节点
        queue.add(initNode);
        isVisited.add(initNode);
        while (!queue.isEmpty()) {
            int size = queue.size();
            step++;

            for (int i = 0; i < size; i++) {
                Integer node = queue.remove();

                for (int j = 1; ; j++) {
                    int nextNode = node - j * j;
                    if (nextNode < 0) break;
                    if (nextNode == 0) return step;

                    if (isVisited.add(nextNode)) {
                        queue.add(nextNode);

                    }

                }

            }

        }

        return -1;
    }

}
