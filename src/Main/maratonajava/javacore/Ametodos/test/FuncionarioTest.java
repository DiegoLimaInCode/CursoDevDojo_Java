package Main.maratonajava.javacore.Ametodos.test;

import Main.maratonajava.javacore.Ametodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Diego");
        funcionario.setIdade(21);
        funcionario.setSalarios(new double[]{2000, 5400.654, 2400});
        funcionario.imprimirFuncionario();
    }
}
