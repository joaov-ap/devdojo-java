package dev.joaov.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(5, 0);
        System.out.println("Codigo finalizado");
    }

    /**
     * @param a cant be zero
     * @param b cant be zero
     * @return int
     * @throws IllegalArgumentException if a or b is zero.
     * */
    private static int divisao(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Parameters can't be zero. There is no division by zero");
        }

        return a / b;
    }
}
