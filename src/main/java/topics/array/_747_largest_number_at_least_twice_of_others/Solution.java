package topics.array._747_largest_number_at_least_twice_of_others;

public class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0, index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (2*nums[i]>max&&i!=index){
                return -1;
            }

        }


        return index;
    }

}
