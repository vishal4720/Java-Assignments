import java.util.*;

public class IterationDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        Set<String> set = new HashSet<>(list);
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println("List Iteration:");
        list.forEach(System.out::println);

        System.out.println("\nSet Iteration:");
        set.forEach(System.out::println);

        System.out.println("\nMap Iteration:");
        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
