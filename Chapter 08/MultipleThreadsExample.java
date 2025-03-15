class TestRunnable implements Runnable {
    private String threadName;
    TestRunnable(String name) {
        threadName = name;
    }
    public void run() {
        System.out.println(threadName + " is running.");
    }
}
public class MultipleThreadsExample {
    public static void main(String[] args) {
        TestRunnable myRunnable1 = new TestRunnable("Thread 1");
        TestRunnable myRunnable2 = new TestRunnable("Thread 2");
        Thread t1 = new Thread(myRunnable1);
        Thread t2 = new Thread(myRunnable2);
        t1.start();
        t2.start();
    }
}
