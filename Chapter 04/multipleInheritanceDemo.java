interface CanFly {
    void fly();
}
interface CanSwim {
    void swim();
}
class Duck implements CanFly, CanSwim {
    public void fly() {
        System.out.println("The duck flies.");
    }
    
    public void swim() {
        System.out.println("The duck swims.");
    }
}
public class multipleInheritanceDemo
{
public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
	duck.swim();
    }
}
