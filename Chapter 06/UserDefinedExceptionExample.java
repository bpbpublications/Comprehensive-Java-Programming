public class UserDefinedExceptionExample {
    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw an AgeException
        } catch (AgeException e) {
            System.out.println("Caught an AgeException: " + e.getMessage());
        }
    }
    // Method that throws the user-defined exception
    static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }
}
