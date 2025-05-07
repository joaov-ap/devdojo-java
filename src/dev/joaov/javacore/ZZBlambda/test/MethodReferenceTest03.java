package dev.joaov.javacore.ZZBlambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Gon", "Naruto", "Luffy", "Dragon", "Leorio", "Killua"));
        nomes.sort(String::compareTo);
        System.out.println(nomes);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("10");
        System.out.println(num);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(nomes, "Luffy"));

    }
}
