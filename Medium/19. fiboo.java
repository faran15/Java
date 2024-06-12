import java.util.Scanner;

class FibonacciRunnable implements Runnable {
    private int n;

    public FibonacciRunnable(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + n + " terms: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

public class fiboo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        FibonacciRunnable fibonacciRunnable = new FibonacciRunnable(n);
        Thread thread = new Thread(fibonacciRunnable);

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        scanner.close();
    }
}
