package Main.maratonajava.javacore.Zgenerics.Test;

import Main.maratonajava.javacore.Zgenerics.Domain.Carro;
import Main.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    static void main() {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por um mes...");
        carroRentavelService.retornarCarroALugado(carro);
    }
}
