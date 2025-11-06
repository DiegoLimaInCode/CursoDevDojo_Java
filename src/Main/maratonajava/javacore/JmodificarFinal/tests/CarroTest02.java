package Main.maratonajava.javacore.JmodificarFinal.tests;

import Main.maratonajava.javacore.JmodificarFinal.domain.Carro;
import Main.maratonajava.javacore.JmodificarFinal.domain.Comprador;
import Main.maratonajava.javacore.JmodificarFinal.domain.Ferrari;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2= new Comprador();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Rafael");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
