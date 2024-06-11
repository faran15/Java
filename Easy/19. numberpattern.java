import java.util.Scanner;

public class numberpattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the number to be printed: ");
        int number = input.nextInt();
        System.out.print("Max Number of times printed: ");
        int maxTimes = input.nextInt();

        // Print the pattern
        printPattern(number, maxTimes);

        input.close();
    }

    public static void printPattern(int number, int maxTimes) {
        // Print pattern in increasing order
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
            }
            System.out.println();
        }

        // Print pattern in decreasing order
        for (int i = maxTimes - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
