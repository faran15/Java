public class ParallelThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberPrinter(1));
        Thread thread2 = new Thread(new NumberPrinter(2));
        Thread thread3 = new Thread(new NumberPrinter(3));
        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class NumberPrinter implements Runnable {
        private int threadNumber;
        private static final int MAX_COUNT = 10;

        public NumberPrinter(int threadNumber) {
            this.threadNumber = threadNumber;
        }

        public void run() {
            for (int i = 1; i <= MAX_COUNT; i++) {
                System.out.println("Thread " + threadNumber + ": " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
