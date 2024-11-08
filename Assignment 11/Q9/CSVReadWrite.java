import java.io.*;

public class CSVReadWrite {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("contacts.csv"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("contacts_copy.csv"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("CSV copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
