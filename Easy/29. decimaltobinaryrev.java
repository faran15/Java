import java.util.Scanner;

public class decimaltobinaryrev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String input = scanner.nextLine();
        if (!input.matches("-?\\d+")) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } else {
            try {
                int decimalNumber = Integer.parseInt(input);
                String binaryString = Integer.toBinaryString(decimalNumber);
                System.out.println("Binary representation: " + binaryString);
                String reversedBinaryString = new StringBuilder(binaryString).reverse().toString();
                System.out.println("Reversed binary: " + reversedBinaryString);
                int reversedDecimal = Integer.parseInt(reversedBinaryString, 2);
                System.out.println("Reverse Number in Decimal: " + reversedDecimal);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        scanner.close();
    }
}
