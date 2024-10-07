class A {

    A() {

        System.out.println("Constructor of A");

    }

}

class B extends A {
    B() {
        super();
        System.out.println("Constructor of B");
    }
}

public class Main {

    public static void main(String[] args) {

        new B();

    }

}