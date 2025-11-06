package Main.maratonajava.javacore.ExercicioLeituraDeDados.test;


import Main.maratonajava.javacore.ExercicioLeituraDeDados.domain.Aluno;
import Main.maratonajava.javacore.ExercicioLeituraDeDados.domain.Local;
import Main.maratonajava.javacore.ExercicioLeituraDeDados.domain.Professores;
import Main.maratonajava.javacore.ExercicioLeituraDeDados.domain.Seminario;

public class ExercicioLeitura {
    public static void main(String[] args) {
        Local local = new Local("Mirandela");
        Aluno aluno = new Aluno("Diego", 21);
        Professores professor = new Professores("Edson", "matematica");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Av1", alunosParaSeminario, local);
        Seminario[] seminaariosDisponiveis ={seminario};
        professor.setSeminarios(seminaariosDisponiveis);
        professor.mostrarDados();
    }
}

