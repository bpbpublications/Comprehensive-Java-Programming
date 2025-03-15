class A {
    B b;
    A() {
        b = new B(this); // Passing 'this' as an argument in constructor
    }
    public void display() {
        System.out.println("Inside Class A");
    }
}
class B {
    A a;
    B(A a) {
        this.a = a;
        a.display();
    }
}
public class Test {
    public static void main(String[] args) {
        A a = new A(); // Output: Inside Class A
    }
}
