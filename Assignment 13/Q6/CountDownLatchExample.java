import java.util.concurrent.*;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " completed work.");
            latch.countDown();
        };

        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executor.submit(task);
        }
        latch.await();
        System.out.println("Main thread proceeding.");
        executor.shutdown();
    }
}
