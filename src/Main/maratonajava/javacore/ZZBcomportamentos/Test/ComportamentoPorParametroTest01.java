package Main.maratonajava.javacore.ZZBcomportamentos.Test;

import Main.maratonajava.javacore.ZZBcomportamentos.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    static void main() {
        List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));
        System.out.println(filterCarByColor(cars, "black"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println("----------");
        System.out.println(filterCarByYear(cars,2025));
        System.out.println("----------");
        System.out.println(filterCarByYear(cars,2010));
        System.out.println("----------");
        System.out.println(filterCarByYear(cars,1997));

    }


    private static List<Car> filterCarByColor(List<Car> cars, String cor) {
        List<Car> filteredCarByColor = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)) {
                filteredCarByColor.add(car);
            }
        }
        return filteredCarByColor;

    }

    private static List<Car> filterCarByYear(List<Car> cars, int year) {
        List<Car> filteredCarByYear = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() <= year) {
                filteredCarByYear.add(car);
            }
        }
        return filteredCarByYear;
    }
}
