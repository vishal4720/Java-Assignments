import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileWithNIO {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("sample.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
