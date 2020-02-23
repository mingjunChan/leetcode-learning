package topics.stack._392_decode_string;

import java.util.Stack;

/**
 * 字符串解码
 * https://leetcode-cn.com/problems/decode-string/
 * 可以简化
 */
@annotation.topics.Stack
public class Solution {

    public String decodeString(String s) {
        String result = null;
        StringBuffer buffer = new StringBuffer();
        Stack<Character> stack = new Stack<Character>();
        int index = 0;
        int num = 0;
        Stack<Integer> numStack = new Stack<Integer>();
        for (Character o : s.toCharArray()) {
            //数字
            if (Character.isDigit(o)) {
                num = num * 10 + Integer.parseInt(String.valueOf(o));

            } else {
                //字符

                //不需要解码的字符
                if ((Character.isLowerCase(o) || Character.isUpperCase(0)) && stack.isEmpty()) {
                    buffer.append(o);
                }else if (']' == o) {
                //需要解码的字符
                    StringBuffer temp = new StringBuffer();
                    while (stack.peek() != '[') {
                        temp.append(stack.pop());
                    }
                    stack.pop();
                    String tempString = temp.reverse().toString();
                    int fontNum = numStack.pop();

                    StringBuffer trueTemp = new StringBuffer();
                    for (int i = 0; i < fontNum; i++) {
                        trueTemp.append(tempString);
                    }
                    String trueTempString = trueTemp.toString();
                    if (stack.isEmpty()) {
                        buffer.append(trueTempString);
                    } else {
                        for (char c : trueTempString.toCharArray()) {
                            stack.push(c);
                        }
                    }
                } else {
                    if ('[' == o) {
                        numStack.push(num);
                        num = 0;
                    }
                    stack.push(o);
                }

            }

        }
        result = buffer.toString();
        return result;
    }

}
