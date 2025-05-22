package dev.joaov.javacore.Dconstrutores.test;

import dev.joaov.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Hunter X Hunter", "TV", 190, "Shounen");
        anime.imprime();
    }
}
