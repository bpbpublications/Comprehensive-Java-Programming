// File: src/com/example/foo/Foo.java
package com.example.foo;

public class Foo {
    public void publicMethod() {
        System.out.println("Public method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void packagePrivateMethod() {
        System.out.println("Package-private method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    public void accessPrivateMethod() {
        privateMethod();  // Private method accessible within the same class
    }
}
