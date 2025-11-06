package Main.maratonajava.javacore.Qstring.Test;

public class StringBuilderTest01 {
    static void main() {
        String nome = "Diego Lima";
        nome.concat("DevDojo");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Diego Lima");
        sb.append(" DevDojo").append(" Academy");
        System.out.println(sb);
    }
}
