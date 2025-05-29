package dev.joaov.javacore.ZZHjunit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
    private Manga manga1;
    private Manga manga2;

    @BeforeEach
    public void setUp() {
        manga1 = new Manga("Hunter x Hunter", 240);
        manga2 = new Manga("Hunter x Hunter", 240);
    }

    @Test
    public void accessors_ReturnData_WhenInitialized() {
        Assertions.assertEquals("Hunter x Hunter", manga1.name());
        Assertions.assertEquals(240, manga1.episodes());
    }

    @Test
    public void equals_ReturnTrue_WhenObjectsAreTheSame() {
        Assertions.assertEquals(manga1, manga2);
    }

    @Test
    public void hashCode_ReturnTrue_WhenObjectsAreTheSame() {
        Assertions.assertEquals(manga1.hashCode(), manga2.hashCode());
    }

    @Test
    public void constructor_ThrowNullPointerExceptioon_WhenNameIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> new Manga(null, 240));
    }

    @Test
    public void isRecoord_ReturnTrue_WhenCalledFromManga() {
        Assertions.assertTrue(Manga.class.isRecord());
    }
}