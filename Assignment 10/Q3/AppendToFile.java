import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            writer.write("This is an appended line.");
            writer.newLine();
            System.out.println("Text appended to log.txt successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
