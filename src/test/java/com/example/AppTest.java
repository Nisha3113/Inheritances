package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testInheritance() {
        Animal myDog = new Dog();
        // Changed makeSound() to sound() to match Animal.java
        assertEquals("Woof", myDog.sound());
    }
}
