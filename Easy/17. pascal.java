import java.util.Scanner;

public class pascal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = input.nextInt();
        
        printPascalsTriangle(n);
        
        input.close();
    }

    public static void printPascalsTriangle(int n) {
        int[][] triangle = new int[n][n];

        // Fill Pascal's Triangle
        for (int line = 0; line < n; line++) {
            for (int i = 0; i <= line; i++) {
                if (i == 0 || i == line) {
                    triangle[line][i] = 1;
                } else {
                    triangle[line][i] = triangle[line - 1][i - 1] + triangle[line - 1][i];
                }
            }
        }

        // Print Pascal's Triangle
        for (int line = 0; line < n; line++) {
            // Print leading spaces
            for (int space = 0; space < n - line - 1; space++) {
                System.out.print(" ");
            }
            // Print the numbers in Pascal's Triangle
            for (int i = 0; i <= line; i++) {
                System.out.print(triangle[line][i] + " ");
            }
            System.out.println();
        }
    }
}
