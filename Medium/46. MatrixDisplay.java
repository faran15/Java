import java.util.Scanner;

public class MatrixDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (N): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix (Row-wise):");
        displayRowWise(matrix);

        System.out.println("Matrix (Column-wise):");
        displayColumnWise(matrix);

        scanner.close();
    }

    public static void displayRowWise(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void displayColumnWise(int[][] matrix) {
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
