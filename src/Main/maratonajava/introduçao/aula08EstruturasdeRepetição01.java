package Main.maratonajava.introduçao;

public class aula08EstruturasdeRepetição01 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("o numero: " + i + " e par");
            } else {
                System.out.println("o numero: " + i + " e impar");
            }
        }
    }
}
