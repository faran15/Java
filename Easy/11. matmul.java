import java.util.Scanner;

public class matmul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = input.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int cols1 = input.nextInt();


        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = input.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int cols2 = input.nextInt();


        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible with the given dimensions.");
            return;
        }

        int[][] mat1 = new int[rows1][cols1];
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                mat1[i][j] = input.nextInt();
            }
        }


        int[][] mat2 = new int[rows2][cols2];
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                mat2[i][j] = input.nextInt();
            }
        }


        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }


        System.out.println("Resultant matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
