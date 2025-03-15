public class ScopeExample {
    // Instance variable
    int instanceVar;

    // Static variable
    static int staticVar;

    public void method() {
        // Local variable
        int localVar = 10;
        System.out.println(localVar); // Accessible within this method
        System.out.println(instanceVar); // Accessible within instance methods
        System.out.println(staticVar); // Accessible within instance methods
    }

    public static void main(String[] args) {
        ScopeExample obj = new ScopeExample();
        obj.method(); // Access instance and static variables
        // System.out.println(localVar); // Error: localVar is not accessible here
        // System.out.println(instanceVar); // Error: instanceVar is not static
        System.out.println(staticVar); // Access static variable
    }
}
