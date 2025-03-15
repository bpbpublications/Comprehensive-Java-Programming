public class Counter {
    // Static variable (class scope)
    static int count = 0;

    // Method to increment the count
    public static void incrementCount() {
        count++;
    }

    // Method to display the count
    public static void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        // Increment count multiple times
        incrementCount();
        incrementCount();
        incrementCount();

        // Display the count
        displayCount();
    }
}
