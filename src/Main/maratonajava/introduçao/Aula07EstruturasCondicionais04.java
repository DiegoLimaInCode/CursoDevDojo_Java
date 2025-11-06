package Main.maratonajava.introduçao;

public class Aula07EstruturasCondicionais04 {
    public static void main(String[] args) {
        char dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Hoje é domingo,final de semana");
                break;
            case 2:
                System.out.println("Hoje é segunda,Dia util");
                break;
            case 3:
                System.out.println("Hoje é terça,Dia util");
                break;
            case 4:
                System.out.println("Hoje é quarta, Dia util");
                break;
            case 5:
                System.out.println("Hoje é quinta,Dia util");
                break;
            case 6:
                System.out.println("Hoje é sexta,Dia Util");
                break;
            case 7:
                System.out.println("Hoje é sabado,Final de semana");
                break;
            default:
                System.out.println("opçao invalida");
                break;
        }
    }
}
