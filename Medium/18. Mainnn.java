class MultiplicationTable extends Thread {
    private int number;

    public MultiplicationTable(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Multiplication Table for " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

public class Mainnn {
    public static void main(String[] args) {
        MultiplicationTable table5 = new MultiplicationTable(5);
        MultiplicationTable table10 = new MultiplicationTable(10);

        System.out.println("Starting Thread for number 5");
        table5.start();

        try {
            table5.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Starting Thread for number 10");
        table10.start();

        try {
            table10.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("All threads are finished.");
    }
}
