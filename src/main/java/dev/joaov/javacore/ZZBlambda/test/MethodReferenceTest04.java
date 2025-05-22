package dev.joaov.javacore.ZZBlambda.test;

import dev.joaov.javacore.ZZBlambda.dominio.Anime;
import dev.joaov.javacore.ZZBlambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Hunter x Hunter", 143), new Anime("One Piece", 1100), new Anime("Yu Yu Hakusho", 100), new Anime("DanDaDan", 25)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Boruto", 150));

    }
}
