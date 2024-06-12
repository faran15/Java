import java.util.Arrays;
import java.util.Scanner;

public class MthMaxNthMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {14, 16, 87, 36, 25, 89, 34};
        int M = 1;
        int N = 3;

        System.out.println("Array of elements = " + Arrays.toString(array));
        System.out.println("M = " + M);
        System.out.println("N = " + N);
        if (M <= 0 || N <= 0 || M > array.length || N > array.length) {
            System.out.println("Invalid input: M and N must be between 1 and the length of the array");
            return;
        }

        Arrays.sort(array);
        int mthMax = array[array.length - M];
        int nthMin = array[N - 1];
        int sum = mthMax + nthMin;
        int difference = mthMax - nthMin;
        System.out.println(M + "th Maximum Number = " + mthMax);
        System.out.println(N + "th Minimum Number = " + nthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
    }
}
