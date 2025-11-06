package Main.maratonajava.javacore.LclassesAbstratas.domain;

public class Estagiaro extends Funcionario {
    public Estagiaro(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Estagiaro{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

}

