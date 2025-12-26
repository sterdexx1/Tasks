package task9;

import java.util.concurrent.RecursiveTask;

public class FactorialTask extends RecursiveTask<Integer> {

    private int n;

    public FactorialTask(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <= 1) {
            return n = 1;
        }
        FactorialTask factorialTask = new FactorialTask(n - 1);
        factorialTask.fork();
        return n * factorialTask.join();
    }
}