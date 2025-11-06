package Main.maratonajava.javacore.Ycolecoes.Test;

import Main.maratonajava.javacore.Ycolecoes.Domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingTest01 {
    static void main() {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Hellsing ultimate");
        mangas.add("Dragon ball");
        mangas.add("Pokemon");
        mangas.add("Attack on titan");
        mangas.add("Berserker");
        mangas.add("Barserker");
        mangas.add("Borserker");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();

        dinheiros.add(100.2);
        dinheiros.add(99.12);
        dinheiros.add(47.23);
        dinheiros.add(12.567);
        dinheiros.add(63.45);


        for (String manga : mangas) {
            System.out.println(manga);

        }
        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);

        new Manga(null, null, 0);
    }
}
