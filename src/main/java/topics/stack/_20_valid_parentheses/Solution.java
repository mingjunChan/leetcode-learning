package topics.stack._20_valid_parentheses;

import annotation.topics.Stack;

import java.util.LinkedList;

public class Solution {
    //'('，')'，'{'，'}'，'['，']'
    @Stack
    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        java.util.Stack<Character> stack = new java.util.Stack<Character>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if ('(' == aChar || '{' == aChar || '[' == aChar) {
                stack.push(aChar);
            } else {
                if (stack.isEmpty()) return false;
                Character character = stack.pop();
                if (character == '(' && aChar != ')') return false;
                if (character == '{' && aChar != '}') return false;
                if (character == '[' && aChar != ']') return false;
            }
        }

        return stack.isEmpty();
    }

    //简化版
    @Stack
    public boolean isVaild2_0(String s) {
        LinkedList<Character> characters = new LinkedList<Character>();
        if (s == null) return false;
        if (s.isEmpty()) return true;
        for (char c : s.toCharArray()) {
            if (c == '(') characters.push(')');
            else if (c == '{') characters.push('}');
            else if (c == '[') characters.push(']');
            else if (characters.isEmpty()||!characters.pop().equals(c)) {
                return false;
            }
        }
        return characters.isEmpty();
    }

}
