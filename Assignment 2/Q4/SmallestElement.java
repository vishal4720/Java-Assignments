public class SmallestElement {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        int smallest = numbers[0];

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Smallest element: " + smallest);
    }
}
