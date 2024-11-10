import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("oldfile.txt");
        if (file.delete()) {
            System.out.println("oldfile.txt was deleted successfully.");
        } else {
            System.out.println("Failed to delete oldfile.txt.");
        }
    }
}
