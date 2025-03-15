public class AreaCalculator {
    
    // Method to calculate the area of a rectangle
    public double area(double length, double width) {
        return length * width;
    }
    
    // Method to calculate the area of a square
    public double area(double side) {
        return side * side;
    }
    
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        
        System.out.println("Area of rectangle: " + calc.area(5.0, 10.0)); // Calls area(double, double)
        System.out.println("Area of square: " + calc.area(5.0)); // Calls area(double)
    }
}
