import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the delimiter: ");
        String delimiter = scanner.nextLine();

        String[] substrings = str.split(delimiter);

        System.out.println("Substrings:");
        for (String substring : substrings) {
            System.out.println(substring);
        }

        scanner.close();
    }
}
