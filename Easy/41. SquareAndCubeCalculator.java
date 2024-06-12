import java.util.Scanner;

public class SquareAndCubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        if (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            double square = number * number;
            double cube = number * number * number;
            System.out.println("Square of " + number + " is: " + square);
            System.out.println("Cube of " + number + " is: " + cube);
        } else {
            System.out.println("Invalid input. Please enter a valid decimal number.");
        }

        scanner.close();
    }
}
