package Main.maratonajava.javacore.Npolimorfismo.test;

import Main.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import Main.maratonajava.javacore.Npolimorfismo.service.RepositorioArquivo;
import Main.maratonajava.javacore.Npolimorfismo.service.RepositorioBancoDados;
import Main.maratonajava.javacore.Npolimorfismo.service.Repositoriomemoria;

public class RepositorioTeste01 {
    public static void main(String[] args) {
        Repositorio repositorio = new Repositoriomemoria();
        repositorio.salvar();
    }
}
