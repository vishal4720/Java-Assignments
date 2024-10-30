public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            int num = 10;
            int result = num / 0;

            try {
                int[] arr = new int[3];
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner try-catch: Array index out of bounds.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer try-catch: Division by zero.");
        }
    }
}
