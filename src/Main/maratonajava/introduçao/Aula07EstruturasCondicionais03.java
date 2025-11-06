package Main.maratonajava.introduçao;

public class Aula07EstruturasCondicionais03 {
    public static void main(String[] args) {
        char dia = 2;
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("opçao invalida");
                break;
        }
    }
}
