import java.util.Scanner;

public class NumberPat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        // Print the pattern
        printPattern(rows);

        input.close();
    }

    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}
