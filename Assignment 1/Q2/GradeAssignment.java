import java.util.Scanner;

public class GradeAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score (0 - 100): ");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else if (score >= 0) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid score entered. Please enter a score between 0 and 100.");
        }
    }
}

