import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {
        String input = "abcb";
        printUniqueCharacters(input);
    }

    public static void printUniqueCharacters(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        System.out.print("Unique characters: ");
        for (char c : str.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                System.out.print(c + " ");
            }
        }
    }
}
