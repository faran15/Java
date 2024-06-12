import java.util.Arrays;
import java.util.Scanner;

public class NthLargestNumber {

    public static int findNthLargest(int[] array, int n) {
        Arrays.sort(array);
        
        return array[array.length - n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {14, 67, 48, 23, 5, 62};

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        if (n <= 0 || n > array.length) {
            System.out.println("Invalid value of N. Please enter a number between 1 and " + array.length);
        } else {
            int nthLargest = findNthLargest(array, n);
            System.out.println("The " + n + "th largest number is: " + nthLargest);
        }

        scanner.close();
    }
}
