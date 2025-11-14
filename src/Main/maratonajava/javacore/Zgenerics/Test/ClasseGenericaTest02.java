package Main.maratonajava.javacore.Zgenerics.Test;

import Main.maratonajava.javacore.Zgenerics.Domain.Barco;
import Main.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    static void main() {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando carro por um mes...");
        barcoRentavelService.retornarBarcoALugado(barco);
    }
}
