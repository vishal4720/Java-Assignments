class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running.");
    }

    public static void main(String[] args) {
        JoinThread t1 = new JoinThread("Thread-1");
        JoinThread t2 = new JoinThread("Thread-2");

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
    }
}
