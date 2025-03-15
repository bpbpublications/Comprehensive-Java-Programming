class TestThread extends Thread {
    private String threadName;
    TestThread(String name) {
        threadName = name;
    }
    public void run() {
        System.out.println(threadName + " is running.");
    }
}
public class MultipleThreadsExample1 {
    public static void main(String[] args) {
        TestThread t1 = new TestThread("Thread 1");
        TestThread t2 = new TestThread("Thread 2");
        t1.start();
        t2.start();
    }
}
