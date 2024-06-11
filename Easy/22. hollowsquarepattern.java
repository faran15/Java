import java.util.Scanner;

public class hollowsquarepattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the symbol from the user
        System.out.print("Enter the symbol: ");
        char symbol = input.next().charAt(0);

        // Get the size of the square from the user
        System.out.print("Enter the size of the square: ");
        int size = input.nextInt();

        // Print the hollow square pattern
        printHollowSquare(size, symbol);

        input.close();
    }

    public static void printHollowSquare(int size, char symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Print the symbol for the border, space for the hollow part
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print(symbol + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
