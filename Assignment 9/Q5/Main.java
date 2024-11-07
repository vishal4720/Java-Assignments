package utilities;

import utilities.Calculator;
import utilities.*;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Converter conv = new Converter();
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Inches to cm: " + conv.inchesToCentimeters(10));
    }
}
