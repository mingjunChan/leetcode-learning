package difficulty.easy;

import annotation.topics.Array;
import base.ListNode;
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
    public void _1021_test(){
        difficulty.easy._1021_remove_outermost_parentheses.Solution solution = new difficulty.easy._1021_remove_outermost_parentheses.Solution();
        System.out.println(solution.removeOuterParentheses("(()())(())(()(()))"));

    }

    @Test
    public void _1108_test() {
        difficulty.easy._1108_defanging_an_ip_address.Solution solution = new difficulty.easy._1108_defanging_an_ip_address.Solution();
        System.out.println(solution.defangIPaddr("1.1.1.1"));
    }

    @Test
    public void _1221_test() {
        difficulty.easy._1221_split_a_string_in_balanced_strings.Solution solution = new difficulty.easy._1221_split_a_string_in_balanced_strings.Solution();
        System.out.println(solution.balancedStringSplit("RLRL"));//2
        System.out.println(solution.balancedStringSplit("RLLLLRRRLR"));//3
        System.out.println(solution.balancedStringSplit("LLLLRRRR"));//1
    }

    @Test
    public void _1281_test() {
        difficulty.easy._1281_subtract_product_and_sum.Solution solution = new difficulty.easy._1281_subtract_product_and_sum.Solution();
        System.out.println(solution.subtractProductAndSum(4421));
    }

    @Test
    public void _1290_test() {
        ListNode head = ListNode.createListNode(new int[]{1, 0, 1});
        ListNode.soutListNode(head);
        difficulty.easy._1290_convert_binary_number_in_a_linked_list_to_integer.Solution solution = new difficulty.easy._1290_convert_binary_number_in_a_linked_list_to_integer.Solution();
        System.out.println(solution.getDecimalValue(head));

    }

    @Test
    public void _1295_test() {
        difficulty.easy._1295_find_numbers_with_even_number_of_digits.Solution solution = new difficulty.easy._1295_find_numbers_with_even_number_of_digits.Solution();
        int nums[] = {12, 345, 2, 6, 7896};
        System.out.println(solution.findNumbers(nums));
    }

    @Test
    public void _1313_testSolution() {
        int[] nums = {1, 2, 3, 4};
        Soluction soluction = new Soluction();
        int[] results = soluction.decompressRLElist(nums);
        System.out.println(Arrays.toString(results));
    }

    @Test
    public void _1321_test() {
        difficulty.easy._1321_maximum_69_number.Solution solution = new difficulty.easy._1321_maximum_69_number.Solution();
        System.out.println(solution.maximum69Number(6969));

    }
}
