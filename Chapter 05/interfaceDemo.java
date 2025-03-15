// Defining an interface named Animal
interface Animal {
    void eat();  // Abstract method
    void sleep();  // Abstract method

    // Default method with implementation
    default void makeSound() {
        System.out.println("This animal makes a sound.");
    }

    // Static method with implementation
    static void describe() {
        System.out.println("Animals are living beings that eat and sleep.");
    }
}
class Dog implements Animal {
	    @Override
	    public void eat() 
            {
	        System.out.println("The dog eats meat.");
            }
    	    @Override
	    public void sleep() {
	        System.out.println("The dog sleeps.");
}
}
public class interfaceDemo {
    public static void main(String[] args) {
        Animal.describe();  // Output: Animals are living beings that eat and sleep.
        Dog dog = new Dog();
        dog.eat();  // Output: The dog eats meat.
        dog.sleep(); // Output: The dog sleeps.

        Animal animal = new Dog();
        animal.eat();  // Output: The dog eats meat.
        animal.sleep(); // Output: The dog sleeps.
    
}
}
