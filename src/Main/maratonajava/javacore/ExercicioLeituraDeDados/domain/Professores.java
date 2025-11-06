package Main.maratonajava.javacore.ExercicioLeituraDeDados.domain;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professores(String nome) {
        this.nome = nome;
    }

    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professores(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void mostrarDados() {
        System.out.println("--------");
        System.out.println("Professor: " + this.nome);
        System.out.println("Seminarios cadastrados");
        if (this.seminarios == null) return;
        System.out.println("Seminarios cadastrados");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereço());
            System.out.println("Alunos");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + " idade: " + aluno.getIdade());
            }

        }

    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {

        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

}
