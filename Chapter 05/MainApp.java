// File: src/com/example/math/MainApp.java
package com.example.math;
class SimpleMath {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
}
public class MainApp {
    public static void main(String[] args) {
        SimpleMath math = new SimpleMath();
        int sum = math.add(10, 5);
        int difference = math.subtract(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
