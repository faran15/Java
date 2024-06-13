import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStatistics {
    public static void main(String[] args) {
        String filePath = "sample.txt";
        try {
           
            Stream<String> lines = Files.lines(Paths.get(filePath));
            long lineCount = lines.count();
            long wordCount = lines.flatMap(line -> Stream.of(line.split("\\s+")))
                                  .filter(word -> !word.isEmpty())
                                  .count();
            long charCount = Files.size(Paths.get(filePath)); // Size gives the number of bytes
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
