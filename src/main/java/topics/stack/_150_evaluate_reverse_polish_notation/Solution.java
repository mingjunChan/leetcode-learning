package topics.stack._150_evaluate_reverse_polish_notation;

import sun.util.resources.cldr.sw.CalendarData_sw_KE;

import java.util.Stack;

public class Solution {

    public int evalRPN(String[] tokens) {
        Integer temp = null;
        Stack<Integer> stack = new Stack<Integer>();
        Integer result = null;
        for (int i = 0; i < tokens.length; i++) {
            if ("+".equals(tokens[i]) || "-".equals(tokens[i]) || "*".equals(tokens[i]) || "/".equals(tokens[i])) {

                result = stack.pop();

                temp = stack.pop();

                switch (tokens[i]) {
                    case "+":
                        result = temp + result;
                        break;

                    case "-":
                        result = temp - result;
                        break;
                    case "*":
                        result = result * temp;
                        break;

                    case "/":
                        result = temp / result;
                        break;

                    default:

                        break;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        if (!stack.isEmpty()) return stack.pop();
        return result;
    }
}
