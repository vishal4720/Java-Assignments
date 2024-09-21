public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Reversing the array
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - i - 1];
            numbers[n - i - 1] = temp;
        }

        System.out.println("\nReversed array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
