class NumberTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}

class LetterTask extends Thread {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letter: " + c);
        }
    }
}

public class MultiTaskThreads {
    public static void main(String[] args) {
        Thread numberThread = new Thread(new NumberTask());
        LetterTask letterThread = new LetterTask();

        numberThread.start();
        letterThread.start();
    }
}
