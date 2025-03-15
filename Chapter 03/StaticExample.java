public class StaticExample {
    static int staticVariable;
    int instanceVariable;
    // Static block to initialize static variable
    static {
        staticVariable = 10;
        System.out.println("Static block executed.");
    }
    // Static method
    public static void displayStatic() {
        System.out.println("Static Variable: " + staticVariable);
        // Cannot access instanceVariable here
    }
    // Instance method
    public void displayInstance() {
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable); // Can access static variables
    }
    public static void main(String[] args) {
        // Accessing static method without creating an instance
        StaticExample.displayStatic();
        // Creating instances
        StaticExample obj1 = new StaticExample();
        obj1.instanceVariable = 20;
        obj1.displayInstance();
        StaticExample obj2 = new StaticExample();
        obj2.instanceVariable = 30;
        obj2.displayInstance();
        // Accessing static variable using class name
        System.out.println("Static Variable accessed via class name: " + StaticExample.staticVariable);
    }
}
