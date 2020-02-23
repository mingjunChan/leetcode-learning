package topics.graph.dfs;

import base.Node;
import base.TreeNode;
import org.junit.Test;
import topics.graph.dfs._200_number_of_islands.Solution;
import util.ArrayUtil;

import java.util.ArrayList;
import java.util.List;

public class TestSolution {

    @Test
    public void testCanVisitAllRooms() {
        topics.graph.dfs._841_keys_and_rooms.Solution solution = new topics.graph.dfs._841_keys_and_rooms.Solution();
//    [[1,3],[3,0,1],[2],[0]]
        List<List<Integer>> rooms = new ArrayList<List<Integer>>();
        List<Integer> room00 = new ArrayList<Integer>();
        room00.add(1);
        room00.add(3);
        List<Integer> room01 = new ArrayList<Integer>();
        room01.add(3);
        room01.add(0);
        room01.add(1);
        List<Integer> room02 = new ArrayList<Integer>();
        room02.add(2);
        List<Integer> room03 = new ArrayList<Integer>();
        room03.add(0);
        rooms.add(room00);
        rooms.add(room01);
        rooms.add(room02);
        rooms.add(room03);

        System.out.println(solution.canVisitAllRooms(rooms));
    }

    @Test
    public void test01Matrix() {
        int[][] matrix = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};

        int[][] matrix2 = {
                {0, 1, 0},
                {0, 1, 0},
                {0, 1, 0},
                {0, 1, 0},
                {0, 1, 0}};
        topics.graph.bfs._542_01_matrix.Solution solution = new topics.graph.bfs._542_01_matrix.Solution();
        solution.updateMatrix(matrix);
        System.out.println(matrix);
    }

    @Test
    public void testFloodFill() {

        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

        topics.graph.dfs._733_flood_fill.Solution solution = new topics.graph.dfs._733_flood_fill.Solution();
        image = solution.floodFill(image, 1, 1, 2);

        System.out.println(image);
    }

    @Test
    public void testInOrder() {
        TreeNode treeNode = TestData.creatTreeNode();
        topics.stack._94_binary_tree_inorder_traversal.Solution solution = new topics.stack._94_binary_tree_inorder_traversal.Solution();
        System.out.println(solution.inorderTraversal(treeNode));
    }

    @Test
    public void testTargetSum() {
        int[] a = TestData.creatArray();
        topics.graph.dfs._494_target_sum.Solution solution = new topics.graph.dfs._494_target_sum.Solution();
        System.out.println(solution.findTargetSumWays(a, 3));
    }

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
