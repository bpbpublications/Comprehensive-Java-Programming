public class ForLoopExample {
      public static void main(String[] args) {
        int size = 5;

        // Outer loop to iterate over rows
        for (int i = 1; i <= size; i++) {
            // Inner loop to iterate over columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print asterisks
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
