import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
