class TestRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " is running, iteration: " + i);
        }
    }
}
public class ThreadMethodsExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new TestRunnable(), "Thread 1");
        Thread t2 = new Thread(new TestRunnable(), "Thread 2");
        t1.start();
        t2.start();
        try {
            t1.join(); // Wait for t1 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t1.getName() + " is alive: " + t1.isAlive());
        System.out.println(t2.getName() + " is alive: " + t2.isAlive());
        t2.setPriority(Thread.MAX_PRIORITY); // Set the highest priority
        System.out.println(t2.getName() + " priority: " + t2.getPriority());
        t2.setDaemon(true); // Set t2 as a daemon thread
        System.out.println(t2.getName() + " is daemon: " + t2.isDaemon());
        Thread.yield(); // Yield execution to other threads
    }
}
