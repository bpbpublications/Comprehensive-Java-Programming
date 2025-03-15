class TestRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running.");
    }
}
public class SingleThreadExample1 {
    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        t1.start();
    }
}
