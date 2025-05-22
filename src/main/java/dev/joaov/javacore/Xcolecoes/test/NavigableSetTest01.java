package dev.joaov.javacore.Xcolecoes.test;

import dev.joaov.javacore.Xcolecoes.dominio.Manga;
import dev.joaov.javacore.Xcolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("HASD21", "iPhone");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Hunter X Hunter", 19.9, 7));
        mangas.add(new Manga(1L, "One Piece", 9.5, 12));
        mangas.add(new Manga(4L, "Naruto", 3.2, 4));
        mangas.add(new Manga(3L, "Yu Yu Hakusho", 11.20, 1));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 3));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(7L, "Yu Yu Hakusho", 7.9, 3);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());

    }
}
