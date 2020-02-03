package topics.graph.dfs;

import base.Node;
import org.junit.Test;
import topics.graph.dfs._200_number_of_islands.Solution;
import util.ArrayUtil;

public class TestSolution {

    @Test
    public void testCloneGraph() {
        Node rootNode = TestData.createGraph(null);
        topics.graph.dfs._133_clone_graph.Solution solution = new topics.graph.dfs._133_clone_graph.Solution();
        Node answer = solution.cloneGraph(rootNode);

        Node rootNode2 = TestData.createGraph();
        topics.graph.dfs._133_clone_graph.Solution solution2 = new topics.graph.dfs._133_clone_graph.Solution();
        Node answer2 = solution2.cloneGraph(rootNode2);
        System.out.println(answer2);
    }

    @Test
    public void testNumberOfIslands() {
        Solution solution = new Solution();

        char[][] chars1 = ArrayUtil.createNUmberOfIslandCharArray1();
        System.out.println(solution.numIslands(chars1));
        char[][] chars2 = ArrayUtil.createNUmberOfIslandCharArray2();
        Solution solution2 = new Solution();
        System.out.println(solution2.numIslands(chars2));
        Solution solution3 = new Solution();
        char[][] chars3 = ArrayUtil.createNUmberOfIslandCharArray3();
        System.out.println(solution3.numIslands(chars3));
        char[][] chars4 = ArrayUtil.createNUmberOfIslandCharArray4();
        Solution solution4 = new Solution();
        System.out.println(solution4.numIslands(chars4));
    }

}
