package Main.maratonajava.introduçao;

public class Aula06EstruturasCondicionais02 {
    public static void main(String[] args) {
        double salario = 67000;
        double imposto = 0;
        double salarioRestante = 0;

        if (salario <= 37721) {
            imposto = salario * 9.70 / 100;
        } else if (salario >= 34713 && salario <= 68507) {
            imposto = salario * 37.35 / 100;
        } else {
            imposto = salario * 49.50 / 100;
        }
        salarioRestante = salario - imposto;
        System.out.println("A taxa que voce deve pagar e de : " + imposto);
        System.out.println("O salario restante que restou é de :" + salarioRestante);
    }
}
