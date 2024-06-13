public class ArithmeticOperations1 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 0;

        try {
            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            int quotient = num1 / num2;
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

