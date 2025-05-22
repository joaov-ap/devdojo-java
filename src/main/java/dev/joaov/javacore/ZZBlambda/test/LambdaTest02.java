package dev.joaov.javacore.ZZBlambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> profissoes = List.of("Pedreiro", "Pintor", "Eletricista");
        List<Integer> map = map(profissoes, s -> s.length());
        List<String> profissoesUpperCase = map(profissoes, p -> p.toUpperCase());
        System.out.println(map);
        System.out.println(profissoesUpperCase);
    }

    private static <T, R>List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }

        return result;
    }
}
