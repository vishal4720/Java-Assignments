import java.io.File;

public class ListFilesAndDirectories {
    public static void main(String[] args) {
        File directory = new File("../Q8");
        if (directory.exists() && directory.isDirectory()) {
            String[] files = directory.list();
            if (files != null) {
                for (String file : files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("No files found in the directory.");
            }
        } else {
            System.out.println("Specified path is not a directory.");
        }
    }
}
