import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2, 3, 6, 7};
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        // Converting HashSet back to array
        int[] newArray = uniqueNumbers.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("Array after removing duplicates: " + Arrays.toString(newArray));
    }
}
