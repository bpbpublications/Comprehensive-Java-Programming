interface CanFly {
    void fly();
}
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Bird extends Animal implements CanFly {
    public void fly() {
        System.out.println("The bird flies.");
    }
}
public class hybridInheritanceDemo
{
public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
    }
}
