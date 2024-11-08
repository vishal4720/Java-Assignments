class Data {
    private int value;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.value = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed: " + value);
        hasData = false;
        notify();
    }
}

class Producer extends Thread {
    private Data data;

    public Producer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            data.produce(i);
        }
    }
}

class Consumer extends Thread {
    private Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            data.consume();
        }
    }
}

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        Data data = new Data();
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        producer.start();
        consumer.start();
    }
}
