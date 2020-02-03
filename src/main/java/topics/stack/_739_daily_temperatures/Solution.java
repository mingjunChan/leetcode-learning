package topics.stack._739_daily_temperatures;

import java.util.Stack;

public class Solution {
    //temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
    public int[] dailyTemperatures(int[] T) {
        int[] results = new int[T.length];

        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < T.length; i++) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                    results[stack.peek()] = i - stack.peek();
                    stack.pop();
                }

            }
            stack.push(i);
        }
        return results;
    }
}