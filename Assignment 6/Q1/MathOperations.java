class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MathOperations mo = new MathOperations();
        System.out.println("Sum of 2 ints: " + mo.add(5, 10));
        System.out.println("Sum of 2 doubles: " + mo.add(5.5, 10.2));
        System.out.println("Sum of 3 ints: " + mo.add(5, 10, 15));
    }

}