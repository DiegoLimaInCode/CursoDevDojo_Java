package Main.maratonajava.javacore.LclassesAbstratas.tests;

import Main.maratonajava.javacore.LclassesAbstratas.domain.Estagiaro;
import Main.maratonajava.javacore.LclassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("rafael", 5000);
        Estagiaro estagiaro = new Estagiaro("Diego", 6000);
        System.out.println(gerente);
        System.out.println(estagiaro);
        estagiaro.imprime();
        gerente.imprime();
    }
}
