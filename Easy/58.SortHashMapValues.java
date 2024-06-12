import java.util.*;

public class SortHashMapValues {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 5);
        map.put("banana", 2);
        map.put("cherry", 8);
        map.put("date", 3);
        List<Map.Entry<String, Integer>> sortedEntries = sortHashMapByValues(map);
        System.out.println("Sorted HashMap by values:");
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static List<Map.Entry<String, Integer>> sortHashMapByValues(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue());

        return entries;
    }
}
