package Main.maratonajava.javacore.Ametodos.test;

import Main.maratonajava.javacore.Ametodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Diego");
        pessoa.setIdade(18);
        System.out.println("O nome desta pessoa é: " + pessoa.getNome() + " e ela tem " + pessoa.getIdade() + " anos de idade");
    }
}
