// File: src/com/example/bar/Bar.java
package com.example.bar;

import com.example.foo.Foo;

public class Bar extends Foo {
    public void testMethods() {
        publicMethod();  // Accessible
        protectedMethod();  // Accessible because Bar is a subclass of Foo
        // packagePrivateMethod();  // Not accessible because Bar is in a different package
        // privateMethod();  // Not accessible because it is private
        accessPrivateMethod();  // Indirectly accessing the private method
    }
}
