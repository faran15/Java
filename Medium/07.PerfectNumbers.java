import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                printFirstNPerfectNumbers(n);
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close();
    }
    public static void printFirstNPerfectNumbers(int n) {
        int count = 0;
        int num = 1;

        System.out.print("First " + n + " perfect numbers are: ");
        
        while (count < n) {
            if (isPerfect(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
    public static boolean isPerfect(int num) {
        int sum = 1; // 1 is always a proper divisor
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num && num != 1;
    }
}
