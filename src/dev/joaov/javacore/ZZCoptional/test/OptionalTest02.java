package dev.joaov.javacore.ZZCoptional.test;

import dev.joaov.javacore.ZZCoptional.dominio.Manga;
import dev.joaov.javacore.ZZCoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Naruto");
        mangaByTitle.ifPresent(m -> m.setTitle("Boruto"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Hunter x Hunter")
                .orElseGet(() -> new Manga(4, "Hunter x Hunter", 430));
        System.out.println(newManga);
    }
}
