import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("source.txt");
                FileOutputStream outputStream = new FileOutputStream("destination.txt")) {
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }
            System.out.println("File copied successfully from source.txt to destination.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
