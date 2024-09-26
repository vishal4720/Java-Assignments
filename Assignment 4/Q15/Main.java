final class Constants {
    final int MAX_VALUE = 100;

    public void display() {
        System.out.println("MAX_VALUE: " + MAX_VALUE);
    }
}

// The following class will give a compilation error because Constants is final
// class ExtendedConstants extends Constants { }

public class Main {
    public static void main(String[] args) {
        Constants constants = new Constants();
        constants.display();
    }
}
