import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (N) in the Fibonacci series: ");
        int N = scanner.nextInt();

        int firstTerm = 0, secondTerm = 1;

        System.out.println("The first " + N + " numbers in the Fibonacci series are:");

        for (int i = 1; i <= N; i++) {
            System.out.print(firstTerm + " "); 

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
