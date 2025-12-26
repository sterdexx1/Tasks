package task4;


public class Main {

    public static void main(String[] args) {

        BlockingQueue blockingQueue = new BlockingQueue(5);

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(1000);
                    blockingQueue.enqueue("Task" + i);
                    System.out.println(blockingQueue.dequeue());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
    }
}
