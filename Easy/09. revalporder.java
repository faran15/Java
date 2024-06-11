import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class revalporder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String inputWord = scanner.nextLine();
        Character[] charArray = new Character[inputWord.length()];
        for (int i = 0; i < inputWord.length(); i++) {
            charArray[i] = inputWord.charAt(i);
        }
        Arrays.sort(charArray);
        Arrays.sort(charArray, Collections.reverseOrder());
        System.out.print("Alphabetical Order: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        scanner.close();
    }
}
