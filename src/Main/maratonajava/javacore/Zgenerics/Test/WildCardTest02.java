package Main.maratonajava.javacore.Zgenerics.Test;


import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    static void main() {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());


    }

    private static void printConsulta(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}
