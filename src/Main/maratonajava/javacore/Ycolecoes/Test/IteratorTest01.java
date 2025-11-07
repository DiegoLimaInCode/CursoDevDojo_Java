package Main.maratonajava.javacore.Ycolecoes.Test;

import Main.maratonajava.javacore.Ycolecoes.Domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    static void main() {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Berserker", 100.25, 0));
        mangas.add(new Manga(3L, "Pokemon", 10.2, 5));
        mangas.add(new Manga(1L, "Hellsing ultimate", 20.1, 0));
        mangas.add(new Manga(7L, "Borserker", 12.3, 2));
        mangas.add(new Manga(2L, "Dragon ball", 15.3, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);

    }
}
