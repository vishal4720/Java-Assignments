import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class ListSetConversion {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "apple", "banana", "orange", "apple", "banana");

        Set<String> set = new HashSet<>(list);
        System.out.println("Converted set (duplicates removed): " + set);

        List<String> newList = new ArrayList<>(set);
        System.out.println("Converted list from set: " + newList);
    }
}
