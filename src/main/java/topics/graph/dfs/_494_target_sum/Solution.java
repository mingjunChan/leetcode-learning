package topics.graph.dfs._494_target_sum;

public class Solution {
    /**
     * 方法一：枚举
     * 我们可以使用递归，枚举出所有可能的情况。具体地，当我们处理到第 i 个数时，我们可以将它添加 + 或 -，
     * 递归地搜索这两种情况。当我们处理完所有的 N 个数时，我们计算出所有数的和，并判断是否等于 S。
     * ·
     *
     * @param nums
     * @param S
     * @return
     */

    private int result;

    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        dfs(nums, 0, sum, S);
        return result;
    }

    private void dfs(int[] nums, int index, int sum, int S) {

        if (index == nums.length) {
            if (sum == S) {
                result++;
            }
            return;
        } else {

            dfs(nums, index + 1, sum + nums[index], S);
            dfs(nums, index + 1, sum - nums[index], S);
        }

        return;
    }

}
