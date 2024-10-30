import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            throw new IllegalArgumentException("Negative number entered: " + num);
        } else {
            System.out.println("You entered: " + num);
        }
    }
}
