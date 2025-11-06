package Main.maratonajava.introduçao;

public class Aula12Arrays02 {
    public static void main(String[] args) {
        double[] idade = new double[3];
        double Idadetotal = 0;
        idade[0] = 21;
        idade[1] = 51;
        idade[2] = 41;
        Idadetotal = idade[0] + idade[1] + idade[2];
        System.out.println("a idade somada de nossos irmaos é de: " + Idadetotal);
    }
}
