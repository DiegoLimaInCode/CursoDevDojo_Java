package Main.maratonajava.javacore.Gassociaçao.test;

import Main.maratonajava.javacore.Gassociaçao.domain.Jogador;
import Main.maratonajava.javacore.Gassociaçao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 =new Jogador("Arrascaeta");
        Time time1 = new Time("Flamengo");
        jogador1.setTime(time1);
        jogador1.imprime();
    }
}
