package dev.joaov.javacore.ZZAcomportamento.test;

import dev.joaov.javacore.ZZAcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("green", 2020), new Car("black", 2015), new Car("red", 1998)));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars,"green"));
        System.out.println(filterCarByColor(cars,"red"));
        System.out.println("----------");
        System.out.println(filterByYearBefore(cars,2016));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
