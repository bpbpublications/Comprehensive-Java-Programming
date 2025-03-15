public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
        System.out.println("Program continues...");
    }
    static int divide(int numerator, int denominator) {
        return numerator / denominator; // This line throws an ArithmeticException
    }
}
