public class LocalVariableExample {
    public static void main(String[] args) {
        // Declaring and initializing a local variable
        int x = 10;
        
        // Printing the value of the local variable
        System.out.println("The value of x is: " + x);
        
        // This is another block of code
        {
            // This is another local variable within a different block
            int y = 20;
            System.out.println("The value of y is: " + y);
        }
        
        // Attempting to access y here would result in a compilation error
        // as y is out of scope
    }
}
