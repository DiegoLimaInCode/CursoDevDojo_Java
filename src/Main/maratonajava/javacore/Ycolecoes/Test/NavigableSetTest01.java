package Main.maratonajava.javacore.Ycolecoes.Test;

import Main.maratonajava.javacore.Ycolecoes.Domain.Manga;
import Main.maratonajava.javacore.Ycolecoes.Domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    static void main() {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("1234", "Nokia");
        set.add(smartphone);
        System.out.println(set);
        System.out.println("\n");
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 0));
        mangas.add(new Manga(10L, "Aaragon", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
