package Main.maratonajava.javacore.Ametodos.test;

import Main.maratonajava.javacore.Ametodos.domain.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "bernardo";
        estudante1.idade = 32;
        estudante1.sexo = 'M';

        estudante2.nome = "rafaela";
        estudante2.idade = 20;
        estudante2.sexo = 'F';
        estudante1.imprime();
        estudante2.imprime();
    }
}

