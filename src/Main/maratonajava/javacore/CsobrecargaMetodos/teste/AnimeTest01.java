package Main.maratonajava.javacore.CsobrecargaMetodos.teste;

import Main.maratonajava.javacore.CsobrecargaMetodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.init("Akudama", "Tv", 12);
        anime.init("Akudama", "Tv", 12, "Drama");
//        anime.imprime();
        System.out.println(anime.getTipo());
    }
}
