import java.util.Scanner;

public class DecimalConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        String input = scanner.nextLine();
        
        try {
            int decimalNumber = Integer.parseInt(input);
            String binaryNumber = Integer.toBinaryString(decimalNumber);
            String octalNumber = Integer.toOctalString(decimalNumber);
            System.out.println("Binary Number = " + binaryNumber);
            System.out.println("Octal Number = " + octalNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }
}
