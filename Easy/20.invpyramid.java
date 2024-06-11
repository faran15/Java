import java.util.Scanner;

public class invpyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows for the inverted full pyramid: ");
        int rows = input.nextInt();
        printInvertedFullPyramid(rows);

        input.close();
    }

    public static void printInvertedFullPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= rows; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
