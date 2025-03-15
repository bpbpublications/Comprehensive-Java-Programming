public class MultipleIfExample {
    public static void main(String[] args) {
        int num = 10;

        // Checking conditions using multiple if statements
        if (num > 0) {
            System.out.println("Number is positive");
        }
        if (num % 2 == 0) {
            System.out.println("Number is even");
        }
        if (num % 5 == 0) {
            System.out.println("Number is divisible by 5");
        }
    }
}
