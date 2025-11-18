package Main.maratonajava.javacore.Zgenerics.Test;

import Main.maratonajava.javacore.Zgenerics.Domain.Barco;
import Main.maratonajava.javacore.Zgenerics.Domain.Carro;
import Main.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import Main.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    static void main() {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("lancha"), new Barco("canoa")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mes...");
        rentalServiceCarro.retornarObjetoALugado(carro);

        System.out.println("----------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mes...");
        rentalServiceBarco.retornarObjetoALugado(barco);
    }
}
