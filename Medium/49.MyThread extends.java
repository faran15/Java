class MyThread extends Thread {
    public MyThread() {
        super(); 
        start(); 
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(); 
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
