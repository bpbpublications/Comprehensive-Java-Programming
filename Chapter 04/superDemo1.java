class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("The dog eats meat.");
    }
    void display() {
        super.eat(); // Calls the eat() method of Animal class
    }
}
public class superDemo1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display(); // Output: This animal eats food.
    }
}
