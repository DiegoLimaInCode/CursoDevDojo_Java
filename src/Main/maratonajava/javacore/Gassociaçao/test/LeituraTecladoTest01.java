package Main.maratonajava.javacore.Gassociaçao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("oque deseja? ");
        System.out.println("1-saber quando é 3x3.");
        System.out.println("2-saber quanto e 5x5.");
        System.out.println("3-saber quanto e 7x3.");
        System.out.print("Digite um numero a seguir: ");
        int next = input.nextInt();
        switch (next) {
            case 1:
                System.out.println(3 * 3);
                break;
            case 2:
                System.out.println(5 * 5);
                break;
            case 3:
                System.out.println(7 * 3);
                break;
            default:
                System.out.println("opçao invalida");
        }
    }
}
