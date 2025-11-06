package Main.maratonajava.javacore.Ametodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;


    public void imprimirFuncionario() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) {
            System.out.println(salario + " ");
        }
        mediaSalarial();
    }

    public void mediaSalarial() {
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media += salarios.length;
        System.out.println("-------------");
        System.out.println("media salarial:" + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
