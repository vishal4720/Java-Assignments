import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeCollectionsDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("X");
        list.add("Y");

        Runnable task = () -> {
            map.put("C", 3);
            list.add("Z");
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Contents of ConcurrentHashMap: " + map);
        System.out.println("Contents of CopyOnWriteArrayList: " + list);
    }
}
