class SharedResource {
    private int data;
    private boolean dataAvailable = false;

    public synchronized void produceData(int value) {
        while (dataAvailable) {
            try {
                wait();  // Wait until the data is consumed
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        dataAvailable = true;
        System.out.println("Produced: " + value);
        notify();  // Notify the consumer that data is available
    }

    public synchronized void consumeData() {
        while (!dataAvailable) {
            try {
                wait();  // Wait until data is produced
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: " + data);
        dataAvailable = false;
        notify();  // Notify the producer that the data has been consumed
    }
}

class ProducerThread extends Thread {
    private SharedResource resource;

    public ProducerThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.produceData(i);
            try {
                Thread.sleep(100);  // Simulate time taken to produce data
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class ConsumerThread extends Thread {
    private SharedResource resource;

    public ConsumerThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.consumeData();
            try {
                Thread.sleep(150);  // Simulate time taken to consume data
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class PCProblem {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        ProducerThread producer = new ProducerThread(resource);
        ConsumerThread consumer = new ConsumerThread(resource);

        producer.start();
        consumer.start();
    }
}

