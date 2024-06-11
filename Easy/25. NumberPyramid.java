import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of rows from the user for the first half
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        // Print the pattern
        printPattern(rows);

        input.close();
    }

    public static void printPattern(int rows) {
        // Print the increasing part of the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Print the decreasing part of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
