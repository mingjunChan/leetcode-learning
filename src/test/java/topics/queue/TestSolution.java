package topics.queue;

import org.junit.Test;

public class TestSolution {

    @Test
    public void testMyCircularQueue() {
        MyCircularQueue circularQueue = new MyCircularQueue(3);

        System.out.println(circularQueue.enQueue(1));  // 返回 true

        System.out.println(circularQueue.enQueue(2));  // 返回 true

        System.out.println(circularQueue.enQueue(3));  // 返回 true

        System.out.println(circularQueue.enQueue(4));  // 返回 false，队列已满

        System.out.println(circularQueue.Rear());  // 返回 3
        System.out.println(circularQueue.Front());  // 返回 1
        System.out.println(circularQueue.isFull());  // 返回 true

        System.out.println(circularQueue.deQueue());  // 返回 true

        System.out.println(circularQueue.enQueue(4));  // 返回 true

    }

}
