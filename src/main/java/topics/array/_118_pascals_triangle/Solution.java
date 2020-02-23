package topics.array._118_pascals_triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if (numRows <= 0) {
            return results;
        }
        List<Integer> line1 = new ArrayList<Integer>();
        results.add(line1);
        line1.add(1);
        if (numRows == 1) {
            return results;
        }
        List<Integer> lastLine = line1;
        for (int i = 2; i <= numRows; i++) {
            List<Integer> newLine = new ArrayList<Integer>();
            newLine.add(1);
            for (int j = 1; j < i - 1; j++) {
                newLine.add(lastLine.get(j - 1) + lastLine.get(j));
            }
            newLine.add(1);
            lastLine = newLine;
            results.add(newLine);
        }

        return results;
    }
}