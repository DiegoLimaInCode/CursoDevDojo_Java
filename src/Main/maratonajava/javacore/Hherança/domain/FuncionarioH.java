package Main.maratonajava.javacore.Hherança.domain;

public class FuncionarioH extends Pessoa {

    private double salario;

    static {
        System.out.println("dentro do bloco de inicializaçao estatico de FuncionarioH");
    }

    {
        System.out.println("dentro do bloco de inicializaçao de FuncionarioH 1");
    }

    {
        System.out.println("dentro do bloco de inicializaçao de FuncionarioH 2 ");
    }

    public FuncionarioH(String nome){
        super(nome);
        System.out.println("dentro do construtor de FuncionarioH");
    }
    public void imprime(){
        super.imprime();
        System.out.println("Seu salario é de: "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
