import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String result1 = str1 + str2;
        System.out.println("Concatenation using + operator: " + result1);

        String result2 = str1.concat(str2);
        System.out.println("Concatenation using concat() method: " + result2);

        scanner.close();
    }
}
