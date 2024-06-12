class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        try {
            Thread.sleep(500);
            System.out.println(threadName + " is running");
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
        System.out.println(threadName + " is exiting.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        try {
            thread1.start();
            thread1.join(); 
            thread2.start();
            thread2.join(); 
            thread3.start();
            thread3.join(); 
} catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread is exiting.");
    }
}
