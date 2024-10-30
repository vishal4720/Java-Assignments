public class MultipleExceptionsSingleCatch {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc");
            int result = num / 0;
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
