import java.util.Scanner;

public class StringOperations1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string 'Welcome to Saveetha university':");
        String inputString = scanner.nextLine();
        System.out.println("Enter the word to be replaced:");
        String oldWord = scanner.nextLine();
        System.out.println("Enter the new word:");
        String newWord = scanner.nextLine();
        String replacedString = inputString.replace(oldWord, newWord);
        System.out.println("String after replacement: " + replacedString);
        int length = inputString.length();
        System.out.println("Length of the string: " + length);
        String upperCaseString = inputString.toUpperCase();
        System.out.println("String in uppercase: " + upperCaseString);
        scanner.close();
    }
}
