// Parent class
class Vehicle {
    String brand;
    int year;
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
// Child class
class Car extends Vehicle {
    int mileage;
    Car(String brand, int year, int mileage) {
        super(brand, year);
        this.mileage = mileage;
    }
    void displayMileage() {
        System.out.println("Mileage: " + mileage + " km");
    }
}
// Main class to test the inheritance
public class inheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the Vehicle class
        Vehicle myVehicle = new Vehicle("Toyota", 2010);
        myVehicle.displayInfo();
        // Create an object of the Car class
        Car myCar = new Car("Honda", 2015, 50000);
        myCar.displayInfo();
        myCar.displayMileage();
    }
}
