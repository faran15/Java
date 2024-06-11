import java.util.Scanner;

public class spechar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a statement:");
        String statement = input.nextLine();

        int specialCharCount = 0;

        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }

        System.out.println("Number of special characters: " + specialCharCount);
    }
}
