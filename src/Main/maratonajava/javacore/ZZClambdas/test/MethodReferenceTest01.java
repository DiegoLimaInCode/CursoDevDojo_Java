package Main.maratonajava.javacore.ZZClambdas.test;

import Main.maratonajava.javacore.ZZClambdas.domain.Anime;
import Main.maratonajava.javacore.ZZClambdas.domain.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    static void main() {
        List<Anime> animeList  = new ArrayList<>( List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));
//        Collections.sort(animeList, (a1,a2)-> a1.getTitle().compareTo(a2.getTitle()));
//        Collections.sort(animeList, AnimeComparators::compareByTitle);
        Collections.sort(animeList, AnimeComparators::compareByEpisodies);
        System.out.println(animeList);

    }

}
