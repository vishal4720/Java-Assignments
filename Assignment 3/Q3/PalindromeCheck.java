import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean isPalindromeString = checkPalindromeWithString(inputString);
        System.out.println("Using String: " + (isPalindromeString ? "Palindrome" : "Not a Palindrome"));

        boolean isPalindromeStringBuffer = checkPalindromeWithStringBuffer(inputString);
        System.out.println("Using StringBuffer: " + (isPalindromeStringBuffer ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }

    public static boolean checkPalindromeWithString(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindromeWithStringBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        String reversedString = sb.reverse().toString();
        return str.equals(reversedString);
    }
}
