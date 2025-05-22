package dev.joaov.javacore.Ygenerics.service;

import dev.joaov.javacore.Ygenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

    public Barco buscarBarcoDisponivel() {
        System.out.println("Buscar barcos disponivel...");
        Barco barco = barcosDisponiveis.remove(ThreadLocalRandom.current().nextInt(0,1));
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo barco " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
