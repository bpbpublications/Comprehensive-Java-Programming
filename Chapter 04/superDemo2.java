class Animal {
    String color = "White";
}
class Dog extends Animal {
    String color = "Black";
    void printColor() {
        System.out.println("Dog color: " + color); // Output: Dog color: Black
        System.out.println("Animal color: " + super.color); // Output: Animal color: White
    }
}
public class superDemo2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();
    }
}
