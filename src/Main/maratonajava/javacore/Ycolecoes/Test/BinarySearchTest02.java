package Main.maratonajava.javacore.Ycolecoes.Test;

import Main.maratonajava.javacore.Ycolecoes.Domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    static void main() {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Berserker", 100.25));
        mangas.add(new Manga(3L, "Pokemon", 10.2));
        mangas.add(new Manga(1L, "Hellsing ultimate", 20.1));
        mangas.add(new Manga(7L, "Borserker", 12.3));
        mangas.add(new Manga(2L, "Dragon ball", 15.3));
        mangas.add(new Manga(4L, "Attack on titan", 5.40));
        mangas.add(new Manga(6L, "Barserker", 234.3));
        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga mangaToSearch = new Manga(6L, "Barserker", 234.3);

        System.out.println(Collections.binarySearch(mangas,mangaToSearch));
    }
}
