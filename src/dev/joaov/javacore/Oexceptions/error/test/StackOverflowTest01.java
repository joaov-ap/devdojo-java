package dev.joaov.javacore.Oexceptions.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursivo();
    }

    public static void recursivo() {
        recursivo();
    }
}
