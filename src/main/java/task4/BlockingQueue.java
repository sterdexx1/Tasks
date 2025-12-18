package task4;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue{

    private final Queue<Object> queue;

    private final int sizeTasks;

    public BlockingQueue(int sizeTasks) {
        this.queue = new LinkedList<>();
        this.sizeTasks = sizeTasks;
    }

    public synchronized void enqueue(Object object) throws InterruptedException {
        while (sizeTasks == queue.size()){
            wait();
        }
        queue.add(object);
        notifyAll();
    }

    public synchronized Object dequeue() throws InterruptedException {
        while (queue.isEmpty()){
            wait();
        }
        Object object = queue.poll();
        notifyAll();
        return object;
    }

    public int size(){
        return queue.size();
    }

}