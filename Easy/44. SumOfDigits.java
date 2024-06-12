import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N value: ");
        if (scanner.hasNextInt()) {
            int N = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter " + N + " digit number: ");
            String number = scanner.nextLine();
            if (number.length() == N && number.matches("\\d+")) {
                int sum = sumOfDigits(number);
                while (sum >= 10) {
                    sum = sumOfDigits(Integer.toString(sum));
                }

                System.out.println("The sum of digits (single digit) is: " + sum);
            } else {
                System.out.println("Invalid input. Please enter a " + N + " digit number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer for N.");
        }

        scanner.close();
    }
    public static int sumOfDigits(String number) {
        int sum = 0;
        for (char digit : number.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return sum;
    }
}
