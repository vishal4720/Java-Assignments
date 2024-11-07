import utilities.Calculator;
import utilities.Converter;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(5, 3));

        Converter converter = new Converter();
        System.out.println("Inches to cm: " + converter.inchesToCentimeters(10));
    }
}