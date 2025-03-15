public class BasicThrowsExample {
    public static void main(String[] args) {
        try {
            checkAge(15); // This will throw an exception
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
    // Declaring that the method throws an Exception
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            // Throwing a checked exception
            throw new Exception("Age must be 18 or older");
        }
        System.out.println("Access granted.");
    }
}
