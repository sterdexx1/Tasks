package task5;

import java.util.concurrent.*;

public class ComplexTaskExecutor {

    private final CyclicBarrier cyclicBarrier;

    public ComplexTaskExecutor(int numberOfTasks) {
        this.cyclicBarrier = new CyclicBarrier(numberOfTasks, () -> System.out.println("All tasks is ended"));
    }

    public void executeTasks(int numberOfTasks) {
        try (ExecutorService executorService = Executors.newFixedThreadPool(numberOfTasks)) {
            for (int i = 0; i < numberOfTasks; i++) {
                executorService.submit(() -> {
                    try {
                        ComplexTask task = new ComplexTask((int) (Math.random() * 100));
                        task.run();
                        cyclicBarrier.await();
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }
        }

    }
}
