import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    static void readFile() throws FileNotFoundException {
        File file = new File("assignment.txt");
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.next());
    }
}
