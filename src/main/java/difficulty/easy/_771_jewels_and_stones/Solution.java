package difficulty.easy._771_jewels_and_stones;

import annotation.topics.HashTable;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    @HashTable
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        Set<Character> judge = new HashSet<Character>();
        for (Character o : J.toCharArray()) {
            judge.add(o);
        }
        for (char c : S.toCharArray()) {
            if (judge.contains(c)) {
                result++;
            }
        }
        return result;
    }

}
