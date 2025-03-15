class Animal {
    Animal getInstance() {
        return this;
    }
}
class Mammal extends Animal {
    @Override
    Mammal getInstance() {
        return this;
    }
}
class Dog extends Mammal {
    @Override
    Dog getInstance() {
        return this;
    }
}
public class covarianceDemo {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Mammal mammalInstance = mammal.getInstance(); // Returns a Mammal
        
        Dog dog = new Dog();
        Dog dogInstance = dog.getInstance(); // Returns a Dog
        // Polymorphism
        Animal animal = new Dog();
        Dog anotherDogInstance = ((Dog) animal.getInstance()); // Need to cast
    }
}
