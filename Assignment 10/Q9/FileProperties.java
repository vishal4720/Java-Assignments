import java.io.File;
import java.util.Date;

public class FileProperties {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("Last modified: " + new Date(file.lastModified()));
            System.out.println("Is a directory: " + file.isDirectory());
            System.out.println("Is a file: " + file.isFile());
        } else {
            System.out.println("File example.txt does not exist.");
        }
    }
}
