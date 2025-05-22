package dev.joaov.javacore.Xcolecoes.test;

import dev.joaov.javacore.Xcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Hunter X Hunter", 19.9));
        mangas.add(new Manga(1L, "One Piece", 9.5));
        mangas.add(new Manga(4L, "Naruto", 3.2));
        mangas.add(new Manga(3L, "Yu Yu Hakusho", 11.20));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99));

        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(6L, "Dragon ball Z", 2.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));

    }
}
