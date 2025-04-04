package dev.joaov.javacore.Npolimorfismo.test;

import dev.joaov.javacore.Npolimorfismo.dominio.Computador;
import dev.joaov.javacore.Npolimorfismo.dominio.Produto;
import dev.joaov.javacore.Npolimorfismo.dominio.Tomate;
import dev.joaov.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 5 8600G", 1200);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("04/02/2025");

        CalculadoraImposto.calcularImposto(produto);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
