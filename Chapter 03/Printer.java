public class Printer {
    
    // Method to print a string
    public void print(String s) {
        System.out.println("String: " + s);
    }
    
    // Method to print an integer
    public void print(int i) {
        System.out.println("Integer: " + i);
    }
    
    // Method to print a double
    public void print(double d) {
        System.out.println("Double: " + d);
    }
    
    public static void main(String[] args) {
        Printer printer = new Printer();
        
        printer.print("Hello, World!"); // Calls print(String)
        printer.print(123); // Calls print(int)
        printer.print(12.34); // Calls print(double)
    }
}