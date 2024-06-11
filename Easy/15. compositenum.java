public class Compositenum {
    public static void main(String[] args) {
        int[] array = {16, 18, 27, 16, 23, 21, 19};
        
        int count = countCompositeNumbers(array);
        
        System.out.println("Array of elements: " + java.util.Arrays.toString(array));
        System.out.println("Number of composite numbers: " + count);
    }

    public static int countCompositeNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isComposite(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not composite numbers
        }
        int divisorCount = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisorCount++;
            }
        }
        return divisorCount > 2;
    }
}
