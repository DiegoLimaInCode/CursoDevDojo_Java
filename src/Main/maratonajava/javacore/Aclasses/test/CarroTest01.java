package Main.maratonajava.javacore.Aclasses.test;

import Main.maratonajava.javacore.Aclasses.domain.Carro1;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro1 c1 = new Carro1();
        Carro1 c2 = new Carro1();
        c1.nome = "Ford";
        c1.ano = 2005;
        c1.modelo = "fiesta";

        c2.nome = "chevrolet";
        c2.ano = 2010;
        c2.modelo = "camaro";
        System.out.println("o carro 1 é um : " + c1.nome + " " + c1.modelo + " e o ano dele é: " + c1.ano);
        System.out.println("o carro 2 é um : " + c2.nome + " " + c2.modelo + " e o ano dele é: " + c2.ano);
    }
}
