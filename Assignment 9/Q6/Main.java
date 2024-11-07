import static utilities.MathOperations.add;
import static utilities.MathOperations.subtract;
import static utilities.MathOperations.multiply;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
    }
}
