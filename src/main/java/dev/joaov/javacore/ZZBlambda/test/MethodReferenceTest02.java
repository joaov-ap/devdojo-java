package dev.joaov.javacore.ZZBlambda.test;

import dev.joaov.javacore.ZZBlambda.dominio.Anime;
import dev.joaov.javacore.ZZBlambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular objectReference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Hunter x Hunter", 143), new Anime("One Piece", 1100), new Anime("Yu Yu Hakusho", 100), new Anime("DanDaDan", 25)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
        System.out.println(animeList);
    }
}
