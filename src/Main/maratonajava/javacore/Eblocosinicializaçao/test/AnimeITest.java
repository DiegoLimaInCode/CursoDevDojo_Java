package Main.maratonajava.javacore.Eblocosinicializaçao.test;

import Main.maratonajava.javacore.Eblocosinicializaçao.domain.AnimeI;

public class AnimeITest {
    public static void main(String[] args) {
        AnimeI anime = new AnimeI("One Piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }


    }

}
