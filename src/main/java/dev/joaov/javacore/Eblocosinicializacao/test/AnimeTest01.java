package dev.joaov.javacore.Eblocosinicializacao.test;

import dev.joaov.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio+" ");
        }

    }
}
