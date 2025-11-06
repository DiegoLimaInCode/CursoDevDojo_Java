package Main.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    static void main() {

        // \d =todos os digitos
        // \D =tudo oque nao for digito
        // \s = espaços em brancos \t \n \f \r
        // \S =todos os caracteres excluindo os brancos
        // \w =todos a-Z A-Z, digitos, e undescore (  _  )
        // \W = tudo o que nao for incluso no \w
        // [] = oque ha dentro e um range de caracteres
        // Ex de range [a-zA-C] = ele pega do a ao z minusculo e do A ao C maisculo
//        String regex = "[a-zA-C]";


        String regex = "0[xX][0-9a-fA-F]";

        String texto = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("indice: 0123456789 ");
        System.out.println("regex: " + regex);
        System.out.println("posiçoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " | " + matcher.group() + "\n");
        }

        // para usar numero hex decimais no java precisamos colocar obrigatoriamente o 0x ou 0X
//
//        int numeroHex = 0x59F86A;
//        System.out.println(numeroHex);
//

    }
}
