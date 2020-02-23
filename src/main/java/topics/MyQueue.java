package topics;

import annotation.topics.Queue;
import annotation.topics.Stack;

import java.util.ArrayList;
import java.util.List;

/**
 * 用栈实现队列
 * https://leetcode-cn.com/explore/learn/card/queue-stack/220/conclusion/888/
 */
@Queue@Stack
public class MyQueue {

    private List<Integer> queue;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        queue = new ArrayList<Integer>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        queue.add(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
       int x =  queue.get(0);
       queue.remove(0);
       return x;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return queue.get(0);
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
