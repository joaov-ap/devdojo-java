package dev.joaov.javacore.Npolimorfismo.servico;

import dev.joaov.javacore.Npolimorfismo.dominio.Produto;
import dev.joaov.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do computador");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: R$" + produto.getValor());
        System.out.println("Imposto a ser pago: R$" + imposto);
        System.out.println("Total: R$" + (imposto + produto.getValor()));
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}
