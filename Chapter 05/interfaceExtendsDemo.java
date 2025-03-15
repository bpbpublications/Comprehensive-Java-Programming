// General interface
interface Animal {
    void eat();
}
// Extended interface
interface FlyingAnimal extends Animal {
    void fly();
}
// Implementing the extended interface in a class
class Bird implements FlyingAnimal {
    @Override
    public void eat() {
        System.out.println("Bird is eating.");
    }
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}
// Another class implementing the general interface
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
}
// Main class to demonstrate the usage
public class interfaceExtendsDemo {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat(); // Output: Bird is eating.
        bird.fly(); // Output: Bird is flying.
        Dog dog = new Dog();
        dog.eat(); // Output: Dog is eating.
        // Using polymorphism
        Animal myAnimal = bird;
        myAnimal.eat(); // Output: Bird is eating.
        // myAnimal.fly(); // This line would cause a compilation error
        FlyingAnimal myFlyingAnimal = bird;
        myFlyingAnimal.eat(); // Output: Bird is eating.
        myFlyingAnimal.fly(); // Output: Bird is flying.
    }
}
