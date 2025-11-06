package Main.maratonajava.javacore.Aclasses.test;

import Main.maratonajava.javacore.Aclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante e = new Estudante();
        e.idade = 21;
        e.nome = "Luffy";
        e.sexo = 'M';

        System.out.println(e.idade);
        System.out.println(e.nome);
        System.out.println(e.sexo);
    }
}
