public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int sum = MathUtils.add(5, 10); // No need to create an instance of MathUtils
        System.out.println("Sum: " + sum); // Output: Sum: 15
    }
}
