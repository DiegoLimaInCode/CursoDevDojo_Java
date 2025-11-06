package Main.maratonajava.javacore.Ycolecoes.Test;

import Main.maratonajava.javacore.Ycolecoes.Domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    static void main() {
        Smartphone s1 = new Smartphone("11111", "Iphone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

//        smartphones.clear(); //Limpa sem tirar as variaveis de referencia

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("44444", "nokia");
        Smartphone s5 = new Smartphone("22222", "Pixel");
        System.out.println( smartphones.contains(s4));
        System.out.println( smartphones.contains(s5));

    }
}
