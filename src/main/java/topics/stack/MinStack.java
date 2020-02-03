package topics.stack;

import java.util.ArrayList;
import java.util.List;

class MinStack {
    private List<Integer> data;
    private int min;
    /**
     * initialize your data structure here.
     */
    public MinStack() {
        data = new ArrayList<Integer>();
    }

    public void push(int x) {
        data.add(x);
    }

    public void pop() {
        data.remove(data.size() - 1);
    }

    public int top() {
        return data.get(data.size() - 1);
    }

    public int getMin() {
        min = data.get(0);
        for (Integer datum : data) {
               if (datum<min) min = datum;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */