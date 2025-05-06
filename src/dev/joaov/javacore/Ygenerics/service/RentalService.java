package dev.joaov.javacore.Ygenerics.service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RentalService<T> {
    private List<T> veiculosDisponiveis;

    public RentalService(List<T> veiculosDisponiveis) {
        this.veiculosDisponiveis = veiculosDisponiveis;
    }

    public T buscarVeiculoDisponivel() {
        System.out.println("Buscar veiculos disponivel...");
        T t = veiculosDisponiveis.remove(ThreadLocalRandom.current().nextInt(0,1));
        System.out.println("Alugando veiculo: " + t);
        System.out.println("Veiculos disponiveis para alugar: ");
        System.out.println(veiculosDisponiveis);
        return t;
    }

    public void retornarVeiculoAlugado(T t) {
        System.out.println("Devolvendo veiculo " + t);
        veiculosDisponiveis.add(t);
        System.out.println("Veiculos disponiveis para alugar: ");
        System.out.println(veiculosDisponiveis);
    }
}
