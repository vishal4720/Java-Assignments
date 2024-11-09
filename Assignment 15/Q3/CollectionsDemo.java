import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 3, 5, 1, 4, 2);

        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

        int index = Collections.binarySearch(numbers, 4);
        System.out.println("Index of 4: " + index);
    }
}
