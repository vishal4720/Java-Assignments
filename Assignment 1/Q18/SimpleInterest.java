import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal, rate, time;

        System.out.print("Enter principal amount: ");
        principal = scanner.nextDouble();
        if (principal < 0) {
            System.out.println("Principal amount cannot be negative.");
            return;
        }

        System.out.print("Enter rate of interest: ");
        rate = scanner.nextDouble();
        if (rate < 0) {
            System.out.println("Rate of interest cannot be negative.");
            return;
        }

        System.out.print("Enter time (in years): ");
        time = scanner.nextDouble();
        if (time < 0) {
            System.out.println("Time cannot be negative.");
            return;
        }

        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}
