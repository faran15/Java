import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            boolean result = isPowerOfThree(n);
            System.out.println("Is the number a power of three? " + result);
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        scanner.close();
    }
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
