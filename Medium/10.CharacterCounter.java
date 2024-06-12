import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countNumbers = 0;

        System.out.println("Enter * to exit…");

        while (true) {
            System.out.print("Enter any character: ");
            char ch = scanner.next().charAt(0);

            if (ch == '*') {
                break;
            }

            if (Character.isUpperCase(ch)) {
                countUpperCase++;
            } else if (Character.isLowerCase(ch)) {
                countLowerCase++;
            } else if (Character.isDigit(ch)) {
                countNumbers++;
            }
        }

        scanner.close();

        System.out.println("Total count of lower case: " + countLowerCase);
        System.out.println("Total count of upper case: " + countUpperCase);
        System.out.println("Total count of numbers: " + countNumbers);
    }
}
