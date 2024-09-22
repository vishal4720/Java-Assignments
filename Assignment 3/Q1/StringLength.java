import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        int length = inputString.length();
        
        System.out.println("The length of the given string is: " + length);

        scanner.close();
    }
}
