package Main.maratonajava.javacore.Fmodificardestatico.domain;

public class AnimeI {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicializaçao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
    }

    public AnimeI(String nome) {
        this.nome = nome;
    }

    public AnimeI() {

        for (int episodio : AnimeI.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
