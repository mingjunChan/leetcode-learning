package difficulty.easy._1313_decompress_run_length_encoded_list;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 * 解压缩编码列表
 */
public class Soluction {
    //length = 4
    //0\1\2\3
    //1\2\3\4
    public int[] decompressRLElist(int[] nums) {
        List<Integer> results = new ArrayList<Integer>();
        for (int i = 0; 2 * i + 1 < nums.length; i++) {
            for (int j = 0; j < nums[2 * i]; j++) {
                results.add(nums[2 * i + 1]);
            }
        }
        int[] result = new int[results.size()];
        for (int i = 0; i < results.size(); i++) {
            result[i] = results.get(i);
        }
        return result;
    }
}
