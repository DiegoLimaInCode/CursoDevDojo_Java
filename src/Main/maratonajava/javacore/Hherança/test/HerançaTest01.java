package Main.maratonajava.javacore.Hherança.test;

import Main.maratonajava.javacore.Hherança.domain.Endereço;
import Main.maratonajava.javacore.Hherança.domain.FuncionarioH;
import Main.maratonajava.javacore.Hherança.domain.Pessoa;

public class HerançaTest01 {
    public static void main(String[] args) {
        Endereço endereço = new Endereço();
        endereço.setRua("rua 3");
        endereço.setCep("63621-223");
        Pessoa pessoa = new Pessoa("Diego");
        pessoa.setCpf("66946495621");
        pessoa.setEndereço(endereço);
        pessoa.imprime();
        FuncionarioH funcionario = new FuncionarioH("rafael");
        funcionario.setCpf("123-456-789-10");
        funcionario.setEndereço(endereço);
        funcionario.setSalario(2000.0);
        System.out.println("--------------");
        funcionario.imprime();
    }
}
