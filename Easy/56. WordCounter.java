import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        Map<String, Integer> wordCountMap = countWords(inputString);

        System.out.println("Word Count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    public static Map<String, Integer> countWords(String str) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = str.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();

            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}
