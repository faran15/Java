import java.util.Scanner;

public class EvenSumFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the N value: ");
        int n = input.nextInt();

        int evenSum = calculateEvenSumFibonacci(n);

        System.out.println("Sum of numbers at even indexes: " + evenSum);

        input.close();
    }

    public static int calculateEvenSumFibonacci(int n) {
        int first = 0, second = 1;
        int evenSum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += first;
            }
            int next = first + second;
            first = second;
            second = next;
        }

        return evenSum;
    }
}
