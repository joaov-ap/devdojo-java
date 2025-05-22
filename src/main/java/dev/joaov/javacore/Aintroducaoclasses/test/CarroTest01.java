package dev.joaov.javacore.Aintroducaoclasses.test;

import dev.joaov.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        Carro jetta = new Carro();

        fusca.nome = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.ano = 1957;

        jetta.nome = "Volkswagen";
        jetta.modelo = "Jetta";
        jetta.ano = 2021;

        System.out.println("Nome: " + fusca.nome + ", Modelo: " + fusca.modelo + ", Ano: " + fusca.ano);
        System.out.println("----------------------------");
        System.out.println("Nome: " + jetta.nome + ", Modelo: " + jetta.modelo + ", Ano: " + jetta.ano);
    }
}
