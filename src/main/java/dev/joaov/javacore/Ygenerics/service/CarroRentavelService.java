package dev.joaov.javacore.Ygenerics.service;

import dev.joaov.javacore.Ygenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("M4"), new Carro("LFA")));

    public Carro buscarCarroDisponivel() {
        System.out.println("Buscar carros disponivel...");
        Carro carro = carrosDisponiveis.remove(ThreadLocalRandom.current().nextInt(0,1));
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro) {
        System.out.println("Devolvendo carro " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }
}
