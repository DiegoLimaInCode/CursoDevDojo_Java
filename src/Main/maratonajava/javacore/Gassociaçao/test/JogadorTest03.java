package Main.maratonajava.javacore.Gassociaçao.test;

import Main.maratonajava.javacore.Gassociaçao.domain.Jogador;
import Main.maratonajava.javacore.Gassociaçao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("luiz araujo");
        Time time = new Time("seleçao brasileira");
        Time time2 = new Time("Flamengo");
        Jogador[] jogadores = {jogador, jogador2};
        jogador.setTime(time);
        jogador2.setTime(time2);

        time.setJogadores(jogadores);
        System.out.println("--- Jogador ---");
        jogador.imprime();
        jogador2.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
