package dev.joaov.javacore.Ygenerics.test;

import dev.joaov.javacore.Ygenerics.dominio.Carro;
import dev.joaov.javacore.Ygenerics.service.CarroRentavelService;

public class ClasseGericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
