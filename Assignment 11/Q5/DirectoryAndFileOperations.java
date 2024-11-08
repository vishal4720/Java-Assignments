import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class DirectoryAndFileOperations {
    public static void main(String[] args) {
        try {
            Path dir = Paths.get("newdir");
            Files.createDirectories(dir);

            Path file = dir.resolve("file.txt");
            Files.write(file, "Hello, world!".getBytes());

            String content = Files.readString(file);
            System.out.println("File content: " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
