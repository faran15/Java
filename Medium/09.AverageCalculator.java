import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPositive = 0;
        int countNegative = 0;
        double sumPositive = 0;
        double sumNegative = 0;

        System.out.println("Enter -1 to exit…");
        
        while (true) {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (number > 0) {
                sumPositive += number;
                countPositive++;
            } else if (number < 0) {
                sumNegative += number;
                countNegative++;
            }
        }

        scanner.close();

        double avgPositive = (countPositive > 0) ? (sumPositive / countPositive) : 0;
        double avgNegative = (countNegative > 0) ? (sumNegative / countNegative) : 0;

        System.out.println("The average of positive numbers is: " + avgPositive);
        System.out.println("The average of negative numbers is: " + avgNegative);
    }
}
