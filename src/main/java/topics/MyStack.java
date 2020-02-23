package topics;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        queue = new LinkedList<Integer>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return shift();
    }

    /**
     * Get the top element.
     */
    public int top() {
        int reuslt = shift();
        queue.add(reuslt)
        ;
        return reuslt;
    }

    private int shift() {
        int size = queue.size();
        while (size-- > 1) {
            queue.add(queue.poll());
        }
        return queue.poll();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */