import java.util.Scanner;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the grade of the employee (A/B): ");
            char grade = scanner.nextLine().charAt(0);
            System.out.print("Enter the employee salary: ");
            double salary = scanner.nextDouble();
            if (salary < 0) {
                System.out.println("Invalid input: Salary cannot be negative.");
                return;
            }

            double bonus = 0;
            switch (grade) {
                case 'A':
                    bonus = salary * 0.05;
                    break;
                case 'B':
                    bonus = salary * 0.10;
                    break;
                default:
                    System.out.println("Invalid input: Grade must be A or B.");
                    return;
            }
            if (salary < 10000) {
                bonus += salary * 0.02;
            }
            double total = salary + bonus;
            System.out.println("Salary = " + salary);
            System.out.println("Bonus = " + bonus);
            System.out.println("Total to be paid = " + total);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter correct details.");
        } finally {
            scanner.close();
        }
    }
}
