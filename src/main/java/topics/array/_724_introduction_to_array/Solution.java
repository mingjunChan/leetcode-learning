package topics.array._724_introduction_to_array;

public class Solution {

    public int pivotIndex(int[] nums) {
        int left = 0, right = 0;
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < i; j++) {
                left += nums[j];
            }
            for (int j = i+1; j < nums.length; j++) {
                right += nums[j];
            }

            if (left == right) {
                return i;
            }
            left = 0;
            right = 0;
        }

        return -1;
    }
}
