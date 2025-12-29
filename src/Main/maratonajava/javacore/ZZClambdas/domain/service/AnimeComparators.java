package Main.maratonajava.javacore.ZZClambdas.domain.service;

import Main.maratonajava.javacore.ZZClambdas.domain.Anime;

public class AnimeComparators {


    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }
    public static int compareByEpisodies(Anime a1,Anime a2){
        return Integer.compare(a1.getEpisodies(), a2.getEpisodies());
    }
}
