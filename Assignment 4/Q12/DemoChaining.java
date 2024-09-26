class DemoChaining {
    public DemoChaining() {
        this(5);
        System.out.println("Default constructor called.");
    }

    public DemoChaining(int x) {
        this(x, 10);
        System.out.println("Constructor with one parameter: " + x);
    }

    public DemoChaining(int x, int y) {
        System.out.println("Constructor with two parameters: " + x + ", " + y);
    }

    public static void main(String[] args) {
        DemoChaining obj = new DemoChaining();
    }
}
