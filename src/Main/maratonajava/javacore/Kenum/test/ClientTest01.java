package Main.maratonajava.javacore.Kenum.test;

import Main.maratonajava.javacore.Kenum.domain.Cliente;
import Main.maratonajava.javacore.Kenum.domain.TipoCliente;
import Main.maratonajava.javacore.Kenum.domain.TipoPagamento;


public class ClientTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Diego", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Diego", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
