import java.util.Scanner;

public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int a = input.nextInt();
        System.out.print("Enter the value of B: ");
        int b = input.nextInt();

        System.out.println("Composite numbers between " + a + " and " + b + " are:");
        printCompositeNumbers(a, b);

        input.close();
    }

    public static void printCompositeNumbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isComposite(int num) {
        if (num < 4) {
            return false; // 1, 2, and 3 are not composite
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true; // Found a divisor, so num is composite
            }
        }
        return false; // No divisors found, so num is not composite
    }
}
