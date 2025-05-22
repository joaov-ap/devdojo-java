package dev.joaov.javacore.Xcolecoes.test;

import dev.joaov.javacore.Xcolecoes.dominio.Consumidor;
import dev.joaov.javacore.Xcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("João Vitor");
        Consumidor consumidor2 = new Consumidor("Will");

        Manga manga1 = new Manga(5L, "Hunter X Hunter", 19.9, 7);
        Manga manga2 = new Manga(1L, "One Piece", 9.5, 12);
        Manga manga3 = new Manga(4L, "Naruto", 3.2, 4);
        Manga manga4 = new Manga(3L, "Yu Yu Hakusho", 11.20, 1);
        Manga manga5 = new Manga(2L, "Dragon ball Z", 2.99, 3);

        List<Manga> mangasConsumidor1 = List.of(manga1, manga4, manga2);
        List<Manga> mangasConsumidor2 = List.of(manga2, manga5, manga3);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, mangasConsumidor1);
        consumidorManga.put(consumidor2, mangasConsumidor2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()) {
            System.out.println("---> " + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("----- " + manga.getNome());
            }
            System.out.println();
        }
    }
}
