package dev.joaov.javacore.Ygenerics.test;

import dev.joaov.javacore.Ygenerics.dominio.Barco;
import dev.joaov.javacore.Ygenerics.dominio.Carro;
import dev.joaov.javacore.Ygenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarVeiculoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalServiceCarro.retornarVeiculoAlugado(carro);

        System.out.println("----------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarVeiculoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.retornarVeiculoAlugado(barco);
    }
}
