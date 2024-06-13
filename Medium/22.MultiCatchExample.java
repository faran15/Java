public class MultiCatchExample {

    public static void main(String[] args) {
        handleArithmeticException();
        handleArrayIndexOutOfBoundsException();
        handleNullPointerException();
    }

    private static void handleArithmeticException() {
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Caught an exception: " + e);
        }
    }

    private static void handleArrayIndexOutOfBoundsException() {
        try {
            int[] array = new int[5];
            int value = array[10]; // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Caught an exception: " + e);
        }
    }

    private static void handleNullPointerException() {
        try {
            String str = null;
            int length = str.length(); // This will cause a NullPointerException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Caught an exception: " + e);
        }
    }
}
