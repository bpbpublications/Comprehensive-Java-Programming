class Animal {
    Animal(String name) {
        System.out.println("Animal constructor called. Name: " + name);
    }
}
class Dog extends Animal {
    Dog(String name) {
        super(name); // Calls the constructor of Animal class
        System.out.println("Dog constructor called. Name: " + name);
    }
}
public class superDemo3 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        // Output:
        // Animal constructor called. Name: Buddy
        // Dog constructor called. Name: Buddy
    }
}
