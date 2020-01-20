package difficulty.easy;

import annotation.topics.Array;
import difficulty.easy._1313_decompress_run_length_encoded_list.Soluction;
import difficulty.easy._771_jewels_and_stones.Solution;
import org.junit.Test;

import java.util.Arrays;

public class TestSolution {
    @Test
    public void _771_test() {
        difficulty.easy._771_jewels_and_stones.Solution solution = new difficulty.easy._771_jewels_and_stones.Solution();
        System.out.println(solution.numJewelsInStones("aA", "aAAABBBBBB"));
    }

    @Test
    public void _1295_test() {
        difficulty.easy._1295_find_numbers_with_even_number_of_digits.Solution solution = new difficulty.easy._1295_find_numbers_with_even_number_of_digits.Solution();
        int nums[] = {12,345,2,6,7896};
        System.out.println(solution.findNumbers(nums));
    }

    @Test
    public void _1313_testSolution() {
        int[] nums = {1, 2, 3, 4};
        Soluction soluction = new Soluction();
        int[] results = soluction.decompressRLElist(nums);
        System.out.println(Arrays.toString(results));
    }
}
