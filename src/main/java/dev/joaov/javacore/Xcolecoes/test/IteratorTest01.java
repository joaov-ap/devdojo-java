package dev.joaov.javacore.Xcolecoes.test;

import dev.joaov.javacore.Xcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Hunter X Hunter", 19.9, 0));
        mangas.add(new Manga(1L, "One Piece", 9.5, 5));
        mangas.add(new Manga(4L, "Naruto", 3.2, 2));
        mangas.add(new Manga(3L, "Yu Yu Hakusho", 11.20, 0));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 1));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
