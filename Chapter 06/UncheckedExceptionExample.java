public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
    // No need to declare ArithmeticException, an unchecked exception
    static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
