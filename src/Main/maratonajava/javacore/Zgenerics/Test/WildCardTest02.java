package Main.maratonajava.javacore.Zgenerics.Test;


import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    static void main() {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals2 = new ArrayList<>();
        printConsultaAnimal(animals2);
    }

    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animals) {
        Animal animal= new Cachorro();
        Animal animal2= new Gato();
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}