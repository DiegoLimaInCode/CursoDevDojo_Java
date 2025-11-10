package Main.maratonajava.javacore.Zgenerics.Test;

import Main.maratonajava.javacore.Ycolecoes.Domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    static void main() {
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Midoriya");

        for (String s : lista) {
            System.out.println(s);
        }

    }
    private static void  add (List<String> lista , Consumidor consumidor){

    }
}
