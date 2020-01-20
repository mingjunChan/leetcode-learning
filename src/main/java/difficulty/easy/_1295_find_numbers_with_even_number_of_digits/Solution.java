package difficulty.easy._1295_find_numbers_with_even_number_of_digits;

/**
 * https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
 */
public class Solution {

    public int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (findNumber(num)) {
                result++;
            }
        }
        return result;
    }

    private boolean findNumber(int num) {
        int digits = 0;
        while (num > 0) {
            num = num / 10;
            digits++;
        }
        if (digits%2==0) return true;
        return false;
    }
}
/**
 * 官方题解
 * 思路1：枚举+字符串
 * 把数字转字符串后计算字符串length，判断偶数个位数的数字，再统计这类数字的数目
 */

/**
 * 官方题解
 * 思路2：枚举+数学
 * 利用语言内置的log10函数
 */

/**
 * 写死if num > 10 && num < 100 的数值+1
 * 略
 */
