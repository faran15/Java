import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of M: ");
        int m = input.nextInt();
        System.out.print("Enter the value of N: ");
        int n = input.nextInt();
        printMultiplicationTable(m, n);

        input.close();
    }
    public static void printMultiplicationTable(int m, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(m + " * " + i + " = " + (m * i));
        }
    }
}
