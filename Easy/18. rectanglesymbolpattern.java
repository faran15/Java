import java.util.Scanner;

public class rectanglesymbolpattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the symbol from the user
        System.out.print("Enter the symbol: ");
        char symbol = input.next().charAt(0);

        // Get the dimensions of the rectangle from the user
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        // Print the rectangle pattern
        printRectangle(rows, cols, symbol);

        input.close();
    }

    public static void printRectangle(int rows, int cols, char symbol) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
