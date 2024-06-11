import java.util.Scanner;

public class invpyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.print("Enter the number of rows for the inverted full pyramid: ");
        int rows = input.nextInt();

        // Print the inverted full pyramid pattern
        printInvertedFullPyramid(rows);

        input.close();
    }

    public static void printInvertedFullPyramid(int rows) {
        // Outer loop to iterate through rows
        for (int i = 1; i <= rows; i++) {
            // Print spaces before stars
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = i; k <= rows; k++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
