class TestThread extends Thread {
    private String threadName;
    TestThread(String name) {
        threadName = name;
    }
    public void run() {
        System.out.println(threadName + " is running.");
    }
}
public class SingleThreadExample {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();
    }
}
