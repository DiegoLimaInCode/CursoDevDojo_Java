package Main.maratonajava.javacore.Npolimorfismo.test;

import Main.maratonajava.javacore.Npolimorfismo.domain.Computador;
import Main.maratonajava.javacore.Npolimorfismo.domain.Produto;
import Main.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import Main.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 25);
        tomate.setDataDeValidade("27/08/2026");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
