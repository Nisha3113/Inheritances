package com.example;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); 
        // We are calling .sound() which now exists in Animal.java
        System.out.println("Inheritance Test: " + myDog.sound());
    }
}
