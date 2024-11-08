class DaemonTask extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon thread running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        DaemonTask daemonThread = new DaemonTask();
        daemonThread.setDaemon(true);
        daemonThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Main thread ending, daemon will terminate.");
    }
}
