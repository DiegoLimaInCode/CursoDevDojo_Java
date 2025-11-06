package Main.maratonajava.javacore.Npolimorfismo.service;

import Main.maratonajava.javacore.Npolimorfismo.domain.Produto;
import Main.maratonajava.javacore.Npolimorfismo.domain.Tomate;


public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto ");
        double imposto = produto.calcularImposto();
        System.out.println("Produto :" + produto.getNome());
        System.out.println("Preço : R$ " + produto.getValor());
        System.out.println("Imposto a ser pago : R$ " + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataDeValidade());
        }
    }
}
