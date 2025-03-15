class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("The dog eats meat.");
    }
}
public class methodOverridingDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat(); // Output: This animal eats food.
        Dog myDog = new Dog();
        myDog.eat(); // Output: The dog eats meat.
        Animal myPet = new Dog();
        myPet.eat(); // Output: The dog eats meat. (runtime polymorphism)
    }
}
