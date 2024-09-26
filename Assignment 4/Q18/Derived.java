class Base {
    public Base() {
        System.out.println("Base class constructor called.");
    }
}

class Derived extends Base {
    public Derived() {
        this(5);
        System.out.println("Derived class default constructor called.");
    }

    public Derived(int x) {
        super();
        System.out.println("Derived class parameterized constructor called with value: " + x);
    }

    public static void main(String[] args) {
        Derived obj = new Derived();
    }
}
