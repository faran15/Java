import java.util.Scanner;

public class NthOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        if (scanner.hasNextInt()) {
            int N = scanner.nextInt();
            if (N >= 0) {
                int nthOddNumber = 2 * N - 1;
                int nthOddAfterN = nthOddNumber + 2 * N;
                System.out.println("Nth odd number: " + nthOddNumber);
                System.out.println("Nth odd number after " + N + " odd numbers: " + nthOddAfterN);
            } else {
                System.out.println("N must be a non-negative integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }
}
