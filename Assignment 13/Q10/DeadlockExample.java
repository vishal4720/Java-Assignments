public class DeadlockExample {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            System.out.println("Locked lock1 in method1");
            synchronized (lock2) {
                System.out.println("Locked lock2 in method1");
            }
        }
    }

    public void method2() {
        synchronized (lock2) {
            System.out.println("Locked lock2 in method2");
            synchronized (lock1) {
                System.out.println("Locked lock1 in method2");
            }
        }
    }

    public static void main(String[] args) {
        DeadlockExample deadlock = new DeadlockExample();
        Thread t1 = new Thread(deadlock::method1);
        Thread t2 = new Thread(deadlock::method2);

        t1.start();
        t2.start();
    }
}
