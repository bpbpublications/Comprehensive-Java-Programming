// Parent class
class Vehicle {
    public String brand;          // Public member
    protected int year;           // Protected member
    String model;                 // Default (package-private) member
    private double price;         // Private member
    // Constructor
    Vehicle(String brand, int year, String model, double price) {
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.price = price;
    }
    // Public method to access private member
    public double getPrice() {
        return price;
    }
    // Protected method
    protected void displayYear() {
        System.out.println("Year: " + year);
    }
    // Default method
    void displayModel() {
        System.out.println("Model: " + model);
    }
    // Private method
    private void displayPrice() {
        System.out.println("Price: " + price);
    }
}
// Child class
class Car extends Vehicle {
    int mileage;
    // Constructor
    Car(String brand, int year, String model, double price, int mileage) {
        super(brand, year, model, price);
        this.mileage = mileage;
    }
    void displayCarInfo() {
        System.out.println("Brand: " + brand);    // Public: accessible
        System.out.println("Year: " + year);      // Protected: accessible
        System.out.println("Model: " + model);    // Default: accessible within the same package
        // System.out.println("Price: " + price); // Private: not accessible directly
        System.out.println("Mileage: " + mileage);
    }
}
// Main class to test the access modifiers
public class memberAccessDemo {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Honda", 2015, "Civic", 20000.0, 50000);
        
        // Accessing members through the child class
        myCar.displayCarInfo();
        
        // Accessing public method to get private member value
        System.out.println("Price: " + myCar.getPrice());
        
        // Accessing protected method
        myCar.displayYear();
        
        // Accessing default method
        myCar.displayModel();
        
        // Private method can't be accessed from outside the class
        // myCar.displayPrice(); // This will cause a compilation error
    }
}
