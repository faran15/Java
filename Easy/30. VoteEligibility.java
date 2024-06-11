import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String input = scanner.nextLine();
        if (!input.matches("\\d+")) {
            System.out.println("Invalid input. Please enter a valid age.");
        } else {
            try {
                int age = Integer.parseInt(input);
                if (age >= 18) {
                    System.out.println("You are eligible to vote.");
                } else {
                    int yearsLeft = 18 - age;
                    System.out.println("You are not eligible to vote. You can vote after " + yearsLeft + " years.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid age.");
            }
        }

        scanner.close();
    }
}
