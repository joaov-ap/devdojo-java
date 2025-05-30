package dev.joaov.javacore.ZZBlambda.test;

import dev.joaov.javacore.ZZBlambda.dominio.Anime;
import dev.joaov.javacore.ZZBlambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Hunter x Hunter", 143), new Anime("One Piece", 1100), new Anime("Yu Yu Hakusho", 100), new Anime("DanDaDan", 25)));
        animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
