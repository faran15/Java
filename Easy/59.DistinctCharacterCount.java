import java.util.HashMap;
import java.util.Map;

public class DistinctCharacterCount {
    public static void main(String[] args) {
        String input = "hello world";
        findDistinctCharacters(input);
    }

    public static void findDistinctCharacters(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) continue; // Ignore whitespaces
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("Distinct characters and their counts:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
