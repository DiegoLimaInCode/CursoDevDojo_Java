package Main.maratonajava.javacore.Npolimorfismo.test;

import Main.maratonajava.javacore.Npolimorfismo.domain.Computador;
import Main.maratonajava.javacore.Npolimorfismo.domain.Produto;
import Main.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------------");
        Produto produto2 = new Tomate("Americano", 25);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("----------------");
    }
}
