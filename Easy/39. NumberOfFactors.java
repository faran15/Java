import java.util.Scanner;

public class NumberOfFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the given number: ");
        int number = input.nextInt();

        int numberOfFactors = findFactors(number);

        System.out.println("Number of factors for " + number + " is: " + numberOfFactors);

        input.close();
    }

    public static int findFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count;
    }
}
