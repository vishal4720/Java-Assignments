class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running by implementing Runnable interface.");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}