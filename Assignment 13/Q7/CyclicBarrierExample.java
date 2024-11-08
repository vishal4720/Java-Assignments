import java.util.concurrent.*;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All threads reached the barrier."));

        Runnable task = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " reached barrier.");
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executor.submit(task);
        }
        executor.shutdown();
    }
}
