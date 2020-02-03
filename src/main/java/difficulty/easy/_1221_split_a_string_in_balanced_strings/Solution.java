package difficulty.easy._1221_split_a_string_in_balanced_strings;

import java.util.Stack;

    @annotation.topics.Stack
public class Solution {
    public int balancedStringSplit(String s) {
        int result = 0;
        Stack<Character> characterStack = new Stack<Character>();
        char[] schar = s.toCharArray();
        char symbol = schar[0];
        for (int i = 0; i < schar.length; i++) {
            char c = schar[i];
            if (characterStack.empty()) symbol = c;
            if (c == symbol) {
                characterStack.push(c);
            } else {
                characterStack.pop();
                if (characterStack.empty()) result++;
            }
        }
        return result;

    }

    //简化方法，用数实现栈，用整数的正负之分来避免栈的入栈字符symbol的变化
    //    public int balancedStringSplit(String s) {
    //        int stack = 0;
    //        int cnt = 0;
    //        for(char c: s.toCharArray()) {
    //            if(c == 'R') {
    //                stack--;
    //            } else {
    //                stack++;
    //            }
    //            if(stack == 0) {
    //                cnt++;
    //            }
    //        }
    //        return cnt;
    //    }
    //
    //
    //作者：nuan
    //链接：https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/solution/yong-shu-shi-xian-zhan-hen-jian-dan-de-shi-xian-by/
    //来源：力扣（LeetCode）
    //著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
