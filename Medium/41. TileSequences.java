import java.util.HashSet;
import java.util.Set;

public class TileSequences {

    public static int numTilePossibilities(String tiles) {
        Set<String> sequences = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];
        backtrack(tiles, "", used, sequences);
        return sequences.size();
    }

    private static void backtrack(String tiles, String current, boolean[] used, Set<String> sequences) {
        if (!current.isEmpty()) {
            sequences.add(current);
        }

        for (int i = 0; i < tiles.length(); i++) {
            if (used[i]) {
                continue;
            }

            if (i > 0 && tiles.charAt(i) == tiles.charAt(i - 1) && !used[i - 1]) {
                continue;
            }

            used[i] = true;
            backtrack(tiles, current + tiles.charAt(i), used, sequences);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        String tiles = "AAB";
        System.out.println(numTilePossibilities(tiles)); // Output: 8
    }
}
