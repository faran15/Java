import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "destination.txt";
        copyFile(sourceFile, destFile);
    }

    public static void copyFile(String source, String dest) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.err.println("An error occurred during file copy: " + e.getMessage());
        }
    }
}
