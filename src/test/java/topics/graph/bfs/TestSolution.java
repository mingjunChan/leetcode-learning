package topics.graph.bfs;

import org.junit.Test;
import topics.graph.bfs._200_number_of_islands.Solution;
import util.ArrayUtil;

public class TestSolution {

    @Test
    public void testNumberOfIslands() {
        Solution solution = new Solution();

        //    char[][] chars1 = ArrayUtil.createNUmberOfIslandCharArray1();
        //   System.out.println(solution.numIslands(chars1));
        // char[][] chars2 = ArrayUtil.createNUmberOfIslandCharArray2();
        // System.out.println(solution.numIslands(chars2));
//        char[][] chars3 = ArrayUtil.createNUmberOfIslandCharArray3();
//        System.out.println(solution.numIslands(chars3));
        char[][] chars4 = ArrayUtil.createNUmberOfIslandCharArray4();
        System.out.println(solution.numIslands(chars4));
    }

    @Test
    public void testOpenTheLock() {

        topics.graph.bfs._752_open_the_lock.Solution solution = new topics.graph.bfs._752_open_the_lock.Solution();
        String[] deadends = {"0201", "0101", "0102", "1212", "2002"};
        String target = "0001";
        System.out.println(solution.openLock(deadends,target));
    }

    @Test
    public void _279_testNumSquares(){
        topics.graph.bfs._279_perfect_squares.Solution solution = new topics.graph.bfs._279_perfect_squares.Solution();
        System.out.println(solution.numSquares(13));//2
        System.out.println(solution.numSquares(12));//3

    }


}
