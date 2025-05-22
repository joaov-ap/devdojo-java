package dev.joaov.javacore.Xcolecoes.test;

import dev.joaov.javacore.Xcolecoes.dominio.Consumidor;
import dev.joaov.javacore.Xcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("João Vitor");
        Consumidor consumidor2 = new Consumidor("Will");

        Manga manga1 = new Manga(5L, "Hunter X Hunter", 19.9, 7);
        Manga manga2 = new Manga(1L, "One Piece", 9.5, 12);
        Manga manga3 = new Manga(4L, "Naruto", 3.2, 4);
        Manga manga4 = new Manga(3L, "Yu Yu Hakusho", 11.20, 1);
        Manga manga5 = new Manga(2L, "Dragon ball Z", 2.99, 3);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " : " + entry.getValue().getNome());
        }
    }
}
