// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
// Subclass Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
// Subclass Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
// Main class to demonstrate dynamic method dispatch
public class dmdDemo {
    public static void main(String[] args) {
        // Reference of superclass type pointing to subclass object
        Animal myAnimal;
        // Creating a Dog object and assigning it to myAnimal
        myAnimal = new Dog();
        myAnimal.makeSound(); // Calls the Dog's version of makeSound()
        // Creating a Cat object and assigning it to myAnimal
        myAnimal = new Cat();
        myAnimal.makeSound(); // Calls the Cat's version of makeSound()
        // Creating an Animal object and assigning it to myAnimal
        myAnimal = new Animal();
        myAnimal.makeSound(); // Calls the Animal's version of makeSound()
    }
}
