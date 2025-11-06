package Main.maratonajava.introduçao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {
        String name = "Diego Lima";
        double salario1Mes = 1300;
        double salario2Mes = 1500;
        double salario3Mes =1450;
        double salarioTotal = (salario1Mes+salario2Mes+salario3Mes);
        System.out.println("Olá,meu nome é "+name+" e no meu primeiro mes de empresa ganhei "+salario1Mes);
        System.out.println("Meu segundo mes na empresa,o meu salario foi de "+salario2Mes);
        System.out.println("e no meu ultimo ano da empresa ganhei "+salario3Mes);
        System.out.println("Ao total meus ganhos na empresa foi de "+salarioTotal);
    }
}
