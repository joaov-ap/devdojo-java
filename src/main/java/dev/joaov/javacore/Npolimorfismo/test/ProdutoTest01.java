package dev.joaov.javacore.Npolimorfismo.test;

import dev.joaov.javacore.Npolimorfismo.dominio.Computador;
import dev.joaov.javacore.Npolimorfismo.dominio.Tomate;
import dev.joaov.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Ryzen 7 9800x3D", 4000);
        Tomate tomate = new Tomate("Tomate Americano", 7.5);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
