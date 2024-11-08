import java.util.concurrent.*;

class Buffer {
    private int data;
    private boolean isEmpty = true;

    public synchronized void produce(int value) throws InterruptedException {
        while (!isEmpty)
            wait();
        data = value;
        isEmpty = false;
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (isEmpty)
            wait();
        isEmpty = true;
        notify();
        return data;
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            try {
                buffer.produce(1);
            } catch (InterruptedException e) {
            }
        });

        executor.submit(() -> {
            try {
                System.out.println(buffer.consume());
            } catch (InterruptedException e) {
            }
        });

        executor.shutdown();
    }
}