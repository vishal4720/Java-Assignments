import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        StringBuffer sb = new StringBuffer(inputString);
        sb.reverse();

        System.out.println("Reversed string: " + sb.toString());

        scanner.close();
    }
}
