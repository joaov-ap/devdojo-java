package dev.joaov.javacore.Zclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Joao";

    static class Nested {
        private String lastName = "Vitor";

        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest03.Nested nested = new OuterClassesTest03.Nested();
        nested.print();
    }
}
