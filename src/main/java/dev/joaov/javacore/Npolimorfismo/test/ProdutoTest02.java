package dev.joaov.javacore.Npolimorfismo.test;

import dev.joaov.javacore.Npolimorfismo.dominio.Computador;
import dev.joaov.javacore.Npolimorfismo.dominio.Produto;
import dev.joaov.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 7 7800x3D", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-----------------------------");

        Produto produto2 = new Tomate("Tomate Americano", 5);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }
}
