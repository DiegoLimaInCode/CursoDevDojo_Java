package Main.maratonajava.javacore.ZZBcomportamentos.Test;

import Main.maratonajava.javacore.ZZBcomportamentos.domain.Car;
import Main.maratonajava.javacore.ZZBcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {

    static void main() {
        List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> carsPerYear = filter(cars, car -> car.getYear() <= 2015);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(carsPerYear);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;

    }



}
