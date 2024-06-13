import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWriteExample {

    public static void main(String[] args) {
        String data = "Computer Science and Engineering";
        String filePath = "example.txt";
        writeToFile(filePath, data);
        readFromFile(filePath);
    }

    private static void writeToFile(String filePath, String data) {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(data);
            System.out.println("Data written to file: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    private static void readFromFile(String filePath) {
        try (FileReader fileReader = new FileReader(filePath)) {
            int character;
            System.out.print("Data read from file: ");
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
