import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the character to be replaced: ");
        char oldChar = scanner.next().charAt(0);

        System.out.print("Enter the replacement character: ");
        char newChar = scanner.next().charAt(0);

        String result = str.replace(oldChar, newChar);

        System.out.println("String after replacement: " + result);

        scanner.close();
    }
}
