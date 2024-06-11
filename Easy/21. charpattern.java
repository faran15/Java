import java.util.Scanner;

public class charpattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the character from the user
        System.out.print("Enter the character to be printed: ");
        char character = input.next().charAt(0);

        // Get the maximum number of times the character should be printed in a row
        System.out.print("Max number of times printed: ");
        int maxTimes = input.nextInt();

        // Print the pattern
        printPattern(character, maxTimes);

        input.close();
    }

    public static void printPattern(char character, int maxTimes) {
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
}
