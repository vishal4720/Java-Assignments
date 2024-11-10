import java.io.File;

public class CheckFileExists {
    public static void main(String[] args) {
        File file = new File("data.txt");
        if (file.exists()) {
            System.out.println("The file data.txt exists.");
        } else {
            System.out.println("The file data.txt does not exist.");
        }
    }
}
