import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStatistics {

    public static void main(String[] args) {
        String filePath = "sample.txt";
        countFileStatistics(filePath);
    }

    public static void countFileStatistics(String filePath) {
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                characterCount += line.length();
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.err.println("An error occurred during file reading: " + e.getMessage());
        }

        System.out.println("Character Count: " + characterCount);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Line Count: " + lineCount);
    }
}
