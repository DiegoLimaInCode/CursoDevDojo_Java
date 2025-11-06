package Main.maratonajava.javacore.Fmodificardestatico.test;

import Main.maratonajava.javacore.Fmodificardestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 300);
        Carro c3 = new Carro("Mercedes", 260);

        Carro.setVelocidadeLimite(190);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
