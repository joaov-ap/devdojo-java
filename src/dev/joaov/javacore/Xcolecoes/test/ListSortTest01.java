package dev.joaov.javacore.Xcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> animes = new ArrayList<>(6);
        animes.add("Hunter x Hunter");
        animes.add("One Piece");
        animes.add("Naruto");
        animes.add("Dragon Ball Z");
        animes.add("DanDaDan");

        Collections.sort(animes);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(54.87);
        dinheiros.add(30.25);
        dinheiros.add(28.95);
        dinheiros.add(87.90);

        for (String anime : animes) {
            System.out.println(anime);
        }
        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);
    }
}
