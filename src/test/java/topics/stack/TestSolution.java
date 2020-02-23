package topics.stack;

import annotation.topics.Stack;
import com.sun.xml.internal.xsom.impl.ForeignAttributesImpl;
import org.junit.Test;
import topics.stack._20_valid_parentheses.Solution;

public class TestSolution {

    @Test
    public void _392decodeString(){
        topics.stack._392_decode_string.Solution solution = new topics.stack._392_decode_string.Solution();
        System.out.println(solution.decodeString("3[a]2[bc]"));//aaabcbc
        System.out.println(solution.decodeString("3[a2[c]]"));//accaccacc
       System.out.println(solution.decodeString("2[abc]3[cd]ef"));//abcabccdcdcdef
    }




    @Test
    public void _150testEvalRPN() {
        topics.stack._150_evaluate_reverse_polish_notation.Solution solution = new topics.stack._150_evaluate_reverse_polish_notation.Solution();
        String[] test1 = {"2", "1", "+", "3", "*"};//9
         //System.out.println(solution.evalRPN(test1));

        String[] test2 = {"4", "13", "5", "/", "+"};//6
         //System.out.println(solution.evalRPN(test2));

        String[] test3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};//22
        System.out.println(solution.evalRPN(test3));

        String[] test4 = {"3", "11", "+", "5", "-"};//9
        System.out.println(solution.evalRPN(test4));

    }

    @Test
    public void _739testDailyTemperatures() {
        topics.stack._739_daily_temperatures.Solution solution = new topics.stack._739_daily_temperatures.Solution();
        //temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] results = solution.dailyTemperatures(temperatures);
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }

    }

    @Test
    public void _20_testValidParentheses() {
        Solution solution = new Solution();
        //  System.out.println(solution.isValid(""));//false
        System.out.println(solution.isVaild2_0("()"));//true
        System.out.println(solution.isVaild2_0("()[]{}"));//true
        System.out.println(solution.isVaild2_0("(]"));//false
        System.out.println(solution.isVaild2_0("([)]"));//false
        System.out.println(solution.isVaild2_0("{[]}"));//true

    }

}
