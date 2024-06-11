import java.util.Scanner;

public class vowcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a statement: ");
        String input = scanner.nextLine();

        int vowelCount = countVowels(input);

        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }

    public static int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }
}
