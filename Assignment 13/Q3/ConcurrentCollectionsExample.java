import java.util.concurrent.*;

public class ConcurrentCollectionsExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        Runnable mapTask = () -> map.put("key", map.getOrDefault("key", 0) + 1);
        Runnable listTask = () -> list.add("Element");

        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executor.submit(mapTask);
            executor.submit(listTask);
        }

        executor.shutdown();
        System.out.println("Map: " + map);
        System.out.println("List: " + list);
    }
}
