import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();
        
        int multiplier = 1;
        
        System.out.println("Multiplication table for " + number + ":");
        while (multiplier <= 10) {
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            multiplier++;
        }
    }
}
