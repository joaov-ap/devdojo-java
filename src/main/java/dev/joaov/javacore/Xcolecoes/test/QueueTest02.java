package dev.joaov.javacore.Xcolecoes.test;

import dev.joaov.javacore.Xcolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L, "Hunter X Hunter", 19.9, 7));
        mangas.add(new Manga(1L, "One Piece", 9.5, 12));
        mangas.add(new Manga(4L, "Naruto", 3.2, 4));
        mangas.add(new Manga(3L, "Yu Yu Hakusho", 11.20, 1));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 3));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
