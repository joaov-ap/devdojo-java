package dev.joaov.javacore.Zclassesinternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking.");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Welcome to the Jungle");
            }
        };

        animal.walk();
    }
}
