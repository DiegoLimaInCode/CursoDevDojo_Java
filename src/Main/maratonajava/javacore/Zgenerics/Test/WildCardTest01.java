package Main.maratonajava.javacore.Zgenerics.Test;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando doguinho");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("consultando gatinho");
    }
}

public class WildCardTest01 {
    static void main() {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);
        Animal[] animals1 = {new Gato(), new Cachorro()};
        System.out.println("-------");
        printConsulta(animals1);
    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}
