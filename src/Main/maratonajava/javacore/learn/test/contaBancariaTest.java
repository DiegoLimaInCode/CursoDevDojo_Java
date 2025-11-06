package Main.maratonajava.javacore.learn.test;

import Main.maratonajava.javacore.learn.domain.ContaBancaria;

public class contaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.init(0077,212.300);
        contaBancaria.imprime();
    }
}
