package Main.maratonajava.javacore.Gassociaçao.test;

import Main.maratonajava.javacore.Gassociaçao.domain.Escola;
import Main.maratonajava.javacore.Gassociaçao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("luffy");
        Professor professor2 = new Professor("kakashi");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Oceano norte", professores);
        escola.imprime();
    }
}
