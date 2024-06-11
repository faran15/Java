import java.util.Scanner;
public class revnumloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String input = scanner.nextLine();
        if (!input.matches("-?\\d+")) {
            System.out.println("Invalid input. Please enter a valid number.");
        } else {
            int number = Integer.parseInt(input);
            int reversedNumber = 0;
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            System.out.println("Reverse Number: " + reversedNumber);
        }

        scanner.close();
    }
}
