public class SubstringCheck {
    public static void main(String[] args) {
        String str = "Hello World!";
        String substring = "World";

        if (str.contains(substring)) {
            System.out.println("The substring '" + substring + "' exists in the string.");
        } else {
            System.out.println("The substring '" + substring + "' does not exist in the string.");
        }
    }
}
