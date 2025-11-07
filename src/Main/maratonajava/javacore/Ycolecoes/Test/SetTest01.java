package Main.maratonajava.javacore.Ycolecoes.Test;

import Main.maratonajava.javacore.Ycolecoes.Domain.Manga;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    static void main() {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Berserker", 19.9, 0));
        mangas.add(new Manga(3L, "Pokemon", 9.5, 5));
        mangas.add(new Manga(1L, "Hellsing ultimate", 3.2, 0));
        mangas.add(new Manga(7L, "Borserker", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
