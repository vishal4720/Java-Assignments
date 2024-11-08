public class ThreadStateExample extends Thread {
    @Override
    public void run() {
        System.out.println("Thread state: " + Thread.currentThread().getState());
    }

    public static void main(String[] args) {
        ThreadStateExample thread = new ThreadStateExample();
        System.out.println("State after creation: " + thread.getState());
        thread.start();
        System.out.println("State after starting: " + thread.getState());
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("State after termination: " + thread.getState());
    }
}
