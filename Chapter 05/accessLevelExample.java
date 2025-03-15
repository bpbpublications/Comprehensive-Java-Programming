// File: src/com/example/bar/Main.java
package com.example.bar;

import com.example.foo.Foo;

public class accessLevelExample {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.publicMethod();  // Accessible
        // foo.protectedMethod();  // Not accessible because Main is not in the same package or a subclass
        // foo.packagePrivateMethod();  // Not accessible because Main is in a different package
        // foo.privateMethod();  // Not accessible because it is private

        Bar bar = new Bar();
        bar.testMethods();  // Accessible because testMethods() is public
    }
}
