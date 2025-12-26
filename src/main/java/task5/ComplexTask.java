package task5;


public class ComplexTask implements Runnable{

    private final int task;

    public ComplexTask(int task) {
        this.task = task;
    }

    @Override
    public void run() {
        try {
            execute();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void execute() throws InterruptedException {
        System.out.println("Task with number " + task + " is started in " + Thread.currentThread().getName());
        Thread.sleep(1000);
        System.out.println("Task with number " + task + " is active");
        Thread.sleep(1000);
        System.out.println("Task with number " + task + " is ended");
    }
}
