public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block start");
            try {
                // Inner try block 1
                System.out.println("Inner try block 1 start");
                int result = 10 / 0; // This will throw ArithmeticException
                System.out.println("Inner try block 1 end");
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }
            try {
                // Inner try block 2
                System.out.println("Inner try block 2 start");
                int[] array = new int[5];
                array[10] = 50; // This will throw ArrayIndexOutOfBoundsException
                System.out.println("Inner try block 2 end");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            }
            System.out.println("Outer try block end");
        } catch (Exception e) {
            System.out.println("Caught Exception in outer try block: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
