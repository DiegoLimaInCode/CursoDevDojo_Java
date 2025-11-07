package Main.maratonajava.javacore.Ycolecoes.Test;

import Main.maratonajava.javacore.Ycolecoes.Domain.Consumidor;
import Main.maratonajava.javacore.Ycolecoes.Domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    static void main() {
        Consumidor consumidor1 = new Consumidor("Diego");
        Consumidor consumidor2 = new Consumidor("Bernardo");

        Manga manga1 = new Manga(5L, "Berserker", 100.25);
        Manga manga2 = new Manga(3L, "Pokemon", 10.2);
        Manga manga3 = new Manga(1L, "Hellsing ultimate", 20.1);
        Manga manga4 = new Manga(7L, "Borserker", 12.3);
        Manga manga5 = new Manga(2L, "Dragon ball", 15.3);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
