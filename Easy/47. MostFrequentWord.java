import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {
        String paragraph = "Ram hit a ball, the hit ball flew far after it was hit";
        String[] banned = {"hit"};

        String result = mostFrequentWord(paragraph, banned);
        System.out.println("Output: " + result);
    }

    public static String mostFrequentWord(String paragraph, String[] banned) {
        String normalized = paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", " ");
        String[] words = normalized.split("\\s+");
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        String mostFrequent = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequent;
    }
}
