package Main.maratonajava.javacore.Npolimorfismo.service;

import Main.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Banco de Dados");
    }
}
