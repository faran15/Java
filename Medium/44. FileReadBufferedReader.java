import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadBufferedReader {

    public static void main(String[] args) {
        String sourceFile = "source.txt";
        readFileUsingBufferedReader(sourceFile);
    }

    public static void readFileUsingBufferedReader(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred during file reading: " + e.getMessage());
        }
    }
}
