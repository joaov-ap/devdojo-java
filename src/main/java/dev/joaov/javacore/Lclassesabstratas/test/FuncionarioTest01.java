package dev.joaov.javacore.Lclassesabstratas.test;

import dev.joaov.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import dev.joaov.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Luffy", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
