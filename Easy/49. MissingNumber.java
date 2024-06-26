public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missing = findMissingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
