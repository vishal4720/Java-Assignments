class Utility {
    static int staticVar;

    static {
        staticVar = 42;
        System.out.println("Static block called. Static variable initialized.");
    }

    public static void main(String[] args) {
        System.out.println("Static variable: " + Utility.staticVar);
    }
}
