import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println("Value for key 2: " + map.get(2));

        map.remove(1);

        System.out.println("HashMap: " + map);
    }
}
