import java.util.concurrent.*;

public class ThreadLocalExample {
    private static final ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable task = () -> {
            int value = threadLocalValue.get() + 1;
            threadLocalValue.set(value);
            System.out.println(Thread.currentThread().getName() + ": " + threadLocalValue.get());
        };

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(task);
        executor.submit(task);
        executor.shutdown();
    }
}
