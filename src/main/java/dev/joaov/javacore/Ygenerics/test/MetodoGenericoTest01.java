package dev.joaov.javacore.Ygenerics.test;

import dev.joaov.javacore.Ygenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }
//    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t) {
//        return List.of(t);
//    }
}
