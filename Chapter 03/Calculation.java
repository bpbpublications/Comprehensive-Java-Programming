public class Calculation {
    int a, b;
    public void setValues(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void displayValues() {
        System.out.println("a: " + a + ", b: " + b);
    }
    public void performTask() {
        this.setValues(10, 20); // Invoking method using 'this'
        this.displayValues();   // Invoking method using 'this'
    }
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        calc.performTask(); // Output: a: 10, b: 20
    }
}