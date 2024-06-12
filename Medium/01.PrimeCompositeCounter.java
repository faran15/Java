import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeCompositeCounter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter the numbers (separated by space):");
        String input = scanner.nextLine();
        scanner.close();
        String[] inputs = input.split("\\s+");
        
        for (String str : inputs) {
            try {
                int num = Integer.parseInt(str);
                if (num > 1) { // We only care about numbers greater than 1 for prime/composite
                    numbers.add(num);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + str + ". Skipping.");
            }
        }
        int primeCount = 0;
        int compositeCount = 0;
        
        for (int num : numbers) {
            if (isPrime(num)) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }
        System.out.println("Composite number: " + compositeCount);
        System.out.println("Prime number: " + primeCount);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
