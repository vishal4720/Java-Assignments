import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2, 3, 6, 7};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int number : numbers) {
            if (seen.contains(number)) {
                duplicates.add(number);
            } else {
                seen.add(number);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
