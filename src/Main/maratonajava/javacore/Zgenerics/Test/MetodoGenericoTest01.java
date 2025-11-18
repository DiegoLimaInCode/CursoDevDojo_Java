package Main.maratonajava.javacore.Zgenerics.Test;

import Main.maratonajava.javacore.Zgenerics.Domain.Barco;
import Main.maratonajava.javacore.Zgenerics.Domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    static void main() {
    criarArrayComUmObjeto(new Barco("Canoa marota"));
    }

    private static <T> void criarArrayComUmObjeto(T t) {
        List<T> list =new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }
}
