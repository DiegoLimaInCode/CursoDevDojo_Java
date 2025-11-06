package Main.maratonajava.javacore.Qstring.Test;

public class StringTest01 {
    static void main() {
        String nome = "diego "; //String constant Pool
        String nome2 = "diego";
        nome = nome.concat(" Lima");  // nome+= "Lima";
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("diego");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
