package task4;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;



class BlockingQueueTest {

    BlockingQueue blockingQueue = new BlockingQueue(5);

    @Test
    void testSingleThreadEnqueueDequeue() throws Exception {
        blockingQueue.enqueue("task");
        Object result = blockingQueue.dequeue();
        assertEquals("task", result.toString());
    }

    @Test
    void testInitMethodSize() {
        assertEquals(0, blockingQueue.size());
    }

    @Test
    void testSizeAfterDequeue() throws Exception {
        blockingQueue.enqueue("task1");
        blockingQueue.enqueue("task2");

        blockingQueue.dequeue();
        assertEquals(1, blockingQueue.size());
    }

    @Test
    void testSizeWhenFull() throws Exception {
        for (int i = 0; i < 5; i++) {
            blockingQueue.enqueue("task" + i);
        }
        assertEquals(5, blockingQueue.size());
    }
}