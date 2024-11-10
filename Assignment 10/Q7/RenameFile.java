import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldFile = new File("temp.txt");
        File newFile = new File("newfile.txt");
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully to newfile.txt.");
        } else {
            System.out.println("Failed to rename temp.txt.");
        }
    }
}
