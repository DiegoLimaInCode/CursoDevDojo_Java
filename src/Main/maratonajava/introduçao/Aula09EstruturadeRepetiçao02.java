package Main.maratonajava.introduçao;

public class Aula09EstruturadeRepetiçao02 {
    public static void main(String[] args) {
        double ValorTotal = 20000;
        for (int parcela = 1; parcela < ValorTotal; parcela++) {
            double ValorParcela = ValorTotal / parcela;
            if (ValorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + ValorParcela);
        }
    }
}
