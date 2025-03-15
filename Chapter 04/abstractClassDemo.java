abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void sleep() {
        System.out.println(name + " is sleeping.");
    }
    abstract void makeSound();
}
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof");
    }
}
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow Meow");
    }
}
public class abstractClassDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.sleep(); // Output: Buddy is sleeping.
        dog.makeSound(); // Output: Buddy says: Woof Woof
        Cat cat = new Cat("Kitty");
        cat.sleep(); // Output: Kitty is sleeping.
        cat.makeSound(); // Output: Kitty says: Meow Meow
    }
}
