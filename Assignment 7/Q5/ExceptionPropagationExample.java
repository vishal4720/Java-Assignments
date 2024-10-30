public class ExceptionPropagationExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
    }

    static void method1() {
        method2();
    }

    static void method2() {
        int result = 10 / 0;
    }
}
