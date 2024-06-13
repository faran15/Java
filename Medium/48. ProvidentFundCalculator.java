import java.util.Scanner;

public class ProvidentFundCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the employee's basic salary: ");
            double basicSalary = scanner.nextDouble();

            if (basicSalary <= 0) {
                throw new IllegalArgumentException("Basic salary should be greater than zero");
            }

            double providentFund = calculateProvidentFund(basicSalary);
            System.out.println("Provident Fund: " + providentFund);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Thank you for using the Provident Fund Calculator.");
        }
    }

    public static double calculateProvidentFund(double basicSalary) {
        return 0.1 * basicSalary;
    }
}
