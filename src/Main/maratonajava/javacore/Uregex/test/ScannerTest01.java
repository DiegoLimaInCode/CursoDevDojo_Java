package Main.maratonajava.javacore.Uregex.test;


public class ScannerTest01 {
    static void main() {
        String texto = "Levi , Eren, Mikasa, true, 200";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
