import packageOne.Utils;

public class Main {
    public static void main(String[] args) {
        Utils utilsOne = new Utils();
        utilsOne.showMessage();

        packageTwo.Utils utilsTwo = new packageTwo.Utils();
        utilsTwo.showMessage();
    }
}
