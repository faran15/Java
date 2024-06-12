import java.util.Scanner;
public class Factorial {
    
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
} else
{
     return n * factorial(n - 1);
}
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        long result = factorial(n);
        System.out.println("The factorial of " + n + " is: " + result);
        scanner.close();
    }
}
