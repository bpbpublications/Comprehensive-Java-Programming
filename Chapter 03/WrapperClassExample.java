import java.util.ArrayList;
public class WrapperClassExample {
    public static void main(String[] args) {
        // Using wrapper classes with collections
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Autoboxing: converting int to Integer
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        // Unboxing: converting Integer to int
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;  // unboxing
        }
        
        System.out.println("Sum: " + sum);
        // Using utility methods
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Max Integer Value: " + maxInt);
        
        boolean isDigit = Character.isDigit('5');
        System.out.println("'5' is a digit: " + isDigit);
    }
}