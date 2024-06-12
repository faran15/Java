import java.util.Scanner;
public class PerfectSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Invalid input. The number must be non-negative.");
            } else {
                double sqrt = Math.sqrt(number);
                if (sqrt == Math.floor(sqrt)) {
                    int intSqrt = (int) sqrt;
                    System.out.println("Square Root: " + intSqrt + ", -" + intSqrt);
                } else {
                    System.out.println("The number is not a perfect square.");
                }
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }
}
