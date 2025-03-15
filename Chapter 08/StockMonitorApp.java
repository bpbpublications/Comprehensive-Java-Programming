import java.util.Random;

class StockPriceMonitor extends Thread {
    private String stockName;
    
    public StockPriceMonitor(String stockName) {
        this.stockName = stockName;
    }
    
    public void run() {
        Random random = new Random();
        while (true) {
            double price = 100 + random.nextDouble() * 50; // Simulate a stock price
            System.out.println(stockName + " Current Price: $" + String.format("%.2f", price));
            try {
                Thread.sleep(1000); // Update every second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class StockMonitorApp {
    public static void main(String[] args) {
        Thread stock1 = new StockPriceMonitor("AAPL");
        Thread stock2 = new StockPriceMonitor("GOOGL");
        
        stock1.start();
        stock2.start();
    }
}

