
class Time1 extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
                System.out.println("Thread 1 Time: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Time2 extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 2 Time: " + i);
        }
    }
}

public class ThreadImplementation {

    public static void main(String[] args) throws InterruptedException {
        Time1 thread1 = new Time1();
        Time2 thread2 = new Time2();

        thread1.start();
        thread2.start();

        // thread2.setPriority(Thread.MIN_PRIORITY); // Set thread2 to minimum priority
        // thread1.setPriority(Thread.MAX_PRIORITY); // Set thread1 to maximum priority
        // thread1.join();
        // thread2.join();

    }
}
