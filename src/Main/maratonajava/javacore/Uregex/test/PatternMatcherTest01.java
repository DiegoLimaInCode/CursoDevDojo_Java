package Main.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    static void main() {
        String regex = "aba";
//        String texto = "abbjhabbhhjjabb";
        String texto = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("indice: 0123456789 ");
        System.out.println("regex: " + regex);
        System.out.println("posiçoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " | ");
        }
    }
}
