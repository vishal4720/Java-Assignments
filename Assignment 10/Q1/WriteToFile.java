import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, this is a sample text written to output.txt");
            writer.newLine();
            writer.write("This is the second line in the file.");
            System.out.println("Text written to output.txt successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
