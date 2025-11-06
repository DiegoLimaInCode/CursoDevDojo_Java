package Main.maratonajava.javacore.JmodificarFinal.domain;

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Computador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
