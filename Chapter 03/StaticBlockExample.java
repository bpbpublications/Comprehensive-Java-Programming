public class StaticBlockExample {
    static int data;
    
    static {
        data = 50; // Static block to initialize static variable
        System.out.println("Static block executed. Data initialized to " + data);
    }
    public static void main(String[] args) {
        System.out.println("Data: " + StaticBlockExample.data); // Output: Data: 50
    }
}
