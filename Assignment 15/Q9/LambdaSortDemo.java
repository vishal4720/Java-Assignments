import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSortDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "Alice", "Bob", "Charlie", "David");

        names.sort(Comparator.comparingInt(String::length));
        System.out.println("Sorted by length: " + names);

        names.sort(String::compareTo);
        System.out.println("Sorted lexicographically: " + names);
    }
}
