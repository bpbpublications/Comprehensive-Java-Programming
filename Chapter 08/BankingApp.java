class Account {
    private int balance = 1000;

    public synchronized void depositAmount(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", New Balance: " + balance);
    }

    public synchronized void withdrawAmount(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds to withdraw " + amount);
        }
    }
}

class Transaction extends Thread {
    private Account account;
    private boolean isDeposit;

    public Transaction(Account account, boolean isDeposit) {
        this.account = account;
        this.isDeposit = isDeposit;
    }

    public void run() {
        if (isDeposit) {
            account.depositAmount(100);
        } else {
            account.withdrawAmount(100);
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Account account = new Account();
        Thread depositThread1 = new Transaction(account, true);  // Deposit
        Thread withdrawThread1 = new Transaction(account, false); // Withdraw
        Thread depositThread2 = new Transaction(account, true);  // Deposit
        Thread withdrawThread2 = new Transaction(account, false); // Withdraw

        depositThread1.start();
        withdrawThread1.start();
        depositThread2.start();
        withdrawThread2.start();

        try {
            depositThread1.join();
            withdrawThread1.join();
            depositThread2.join();
            withdrawThread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

