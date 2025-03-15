public class Calculator {

    // Method with parameters
    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Call the method with parameters
        int result = calculator.add(5, 3);

        // Print the result
        System.out.println("The sum is: " + result);
    }
}
