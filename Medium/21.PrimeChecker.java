import java.util.Scanner;

public class PrimeChecker implements Runnable {
    private int number;

    public PrimeChecker(int number) {
        this.number = number;
    }

    public void run() {
        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is not Prime");
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            PrimeChecker primeChecker = new PrimeChecker(number);
            Thread thread = new Thread(primeChecker);
            thread.start();
            thread.join();  // Wait for the thread to finish
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}
