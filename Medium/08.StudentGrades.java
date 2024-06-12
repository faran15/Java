import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the marks in Python: ");
            double pythonMarks = scanner.nextDouble();
            
            System.out.print("Enter the marks in C Programming: ");
            double cProgrammingMarks = scanner.nextDouble();
            
            System.out.print("Enter the marks in Mathematics: ");
            double mathMarks = scanner.nextDouble();
            
            System.out.print("Enter the marks in Physics: ");
            double physicsMarks = scanner.nextDouble();
            if (pythonMarks < 0 || cProgrammingMarks < 0 || mathMarks < 0 || physicsMarks < 0 ||
                pythonMarks > 100 || cProgrammingMarks > 100 || mathMarks > 100 || physicsMarks > 100) {
                System.out.println("Invalid input: Marks should be between 0 and 100.");
                return;
            }
            double total = pythonMarks + cProgrammingMarks + mathMarks + physicsMarks;
            double aggregate = total / 4;


            String grade;
            if (aggregate > 75) {
                grade = "DISTINCTION";
            } else if (aggregate >= 60) {
                grade = "FIRST DIVISION";
            } else if (aggregate >= 50) {
                grade = "SECOND DIVISION";
            } else if (aggregate >= 40) {
                grade = "THIRD DIVISION";
            } else {
                grade = "FAIL";
            }
            System.out.println("Total = " + total);
            System.out.println("Aggregate = " + aggregate);
            System.out.println(grade);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid marks.");
        } finally {
            scanner.close();
        }
    }
}
