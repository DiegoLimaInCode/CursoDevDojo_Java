package Main.maratonajava.javacore.Npolimorfismo.test;

import Main.maratonajava.javacore.Npolimorfismo.domain.Computador;
import Main.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import Main.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("i5-10400f", 11000);
        Tomate tomate = new Tomate("siciliano", 10);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------");
        CalculadoraImposto.calcularImposto(tomate);
    }

}
