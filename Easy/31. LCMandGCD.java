
import java.util.Scanner;

public class LCMandGCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter the number of values (N): ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int gcd = numbers[0];
        for (int i = 1; i < n; i++) {
            gcd = findGCD(gcd, numbers[i]);
        }
        int lcm = numbers[0];
        for (int i = 1; i < n; i++) {
            lcm = findLCM(lcm, numbers[i], gcd);
        }

        System.out.println("GCD of the numbers: " + gcd);
        System.out.println("LCM of the numbers: " + lcm);

        input.close();
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }


    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
