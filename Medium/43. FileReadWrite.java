import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "destination.txt";
        copyFileUsingReaderWriter(sourceFile, destFile);
    }

    public static void copyFileUsingReaderWriter(String source, String dest) {
        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter(dest)) {

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("File copied successfully using FileReader and FileWriter!");

        } catch (IOException e) {
            System.err.println("An error occurred during file copy: " + e.getMessage());
        }
    }
}
