package Main.maratonajava.javacore.Ycolecoes.Test;

import Main.maratonajava.javacore.Ycolecoes.Domain.Consumidor;
import Main.maratonajava.javacore.Ycolecoes.Domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    static void main() {
        Consumidor consumidor1 = new Consumidor("Diego");
        Consumidor consumidor2 = new Consumidor("Bernardo");

        Manga manga1 = new Manga(5L, "Berserker", 100.25);
        Manga manga2 = new Manga(3L, "Pokemon", 10.2);
        Manga manga3 = new Manga(1L, "Hellsing ultimate", 20.1);
        Manga manga4 = new Manga(7L, "Borserker", 12.3);
        Manga manga5 = new Manga(2L, "Dragon ball", 15.3);


        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga4);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1,mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2,mangaConsumidor2List);
        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println("-----"+entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("-----"+manga.getNome());
            }

        }
    }
}
