public class DoWhileLoopExample {
    public static void main(String[] args) {
        int count = 1;

        // Execute the loop body at least once
        do {
            System.out.println("Count is: " + count);
            count++; // Increment count by 1
        } while (count <= 5);
    }
}
