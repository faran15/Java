public class MissingNumber1 {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 7, 8, 6}; // Given array with one missing number
        int n = 8; // n is the range of numbers from 1 to n
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        int missingNumber = totalSum - sum;
        System.out.println("Missing number is: " + missingNumber);
    }
}
