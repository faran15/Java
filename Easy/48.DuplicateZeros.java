import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println("Original array: " + Arrays.toString(arr));
        duplicateZeros(arr);
        System.out.println("Modified array: " + Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (i + zeros < n) {
                arr[i + zeros] = arr[i];
            }
            if (arr[i] == 0) {
                zeros--;
                if (i + zeros < n) {
                    arr[i + zeros] = 0;
                }
            }
        }
    }
}
