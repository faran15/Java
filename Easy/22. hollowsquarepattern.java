import java.util.Scanner;

public class hollowsquarepattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the symbol: ");
        char symbol = input.next().charAt(0);
        System.out.print("Enter the size of the square: ");
        int size = input.nextInt();
        printHollowSquare(size, symbol);

        input.close();
    }

    public static void printHollowSquare(int size, char symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
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
