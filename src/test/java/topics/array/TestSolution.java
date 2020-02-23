package topics.array;

import annotation.topics.Array;
import org.junit.Test;
import topics.array._724_introduction_to_array.Solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSolution {
    @Test
    public void tesst118pascalsTriangle(){
        topics.array._118_pascals_triangle.Solution solution = new topics.array._118_pascals_triangle.Solution();
        System.out.println(solution.generate(5));

    }


    @Test
    public void test54(){
        topics.array._54_spiral_matrix.Solution solution = new topics.array._54_spiral_matrix.Solution();
//        List<Integer> result = solution.spiralOrder(new int[][]{
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        });
        List<Integer> result2 = solution.spiralOrder(new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        });
        System.out.println(result2);
    }


    @Test
    public void test498(){

        //int[][] haha = new int[][]{{1,2,3}};
        topics.array._498_diagonal_traverse.Solution solution = new topics.array._498_diagonal_traverse.Solution();
        System.out.println(Arrays.toString(solution.findDiagonalOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}})));



    }
    @Test
    public  void test66(){
        topics.array._66_plus_one.Solution solution = new topics.array._66_plus_one.Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9,9})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{3,9})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{0})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{3,3})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{3})));
    }
    @Test
    public void test747(){
        topics.array._747_largest_number_at_least_twice_of_others.Solution solution = new topics.array._747_largest_number_at_least_twice_of_others.Solution();
        System.out.println(solution.dominantIndex(new int[]{3,6,1,0}));
        System.out.println(solution.dominantIndex(new int[]{1,2,3,4}));
    }


    @Test
    public void testPivotIndex(){
        Solution solution = new Solution();
        System.out.println(solution.pivotIndex(new int[]{1,2,3}));


    }
}
