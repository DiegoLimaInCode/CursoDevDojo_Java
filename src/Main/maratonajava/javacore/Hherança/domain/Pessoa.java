package Main.maratonajava.javacore.Hherança.domain;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereço endereço;

    static {
        System.out.println("dentro do bloco de inicializaçao estatico de pessoa");
    }

    {
        System.out.println("dentro do bloco de inicializaçao de pessoa 1");
    }

    {
        System.out.println("dentro do bloco de inicializaçao de pessoa 2 ");
    }

    public Pessoa(String nome) {
        System.out.println("dentro do construtor de pessoa");
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Morador: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Rua: " + this.endereço.getRua() + " cep: " + this.endereço.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
}
