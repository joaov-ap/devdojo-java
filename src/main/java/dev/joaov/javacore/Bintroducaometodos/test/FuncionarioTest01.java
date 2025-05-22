package dev.joaov.javacore.Bintroducaometodos.test;

import dev.joaov.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Will";
        funcionario.idade = 32;
        funcionario.salarios = new double[]{2500, 3200, 1200};

        funcionario.imprimeDadosFuncionario();
        double mediaSalario = funcionario.mediaSalario();
        System.out.println();
        System.out.println("Media salario: "+mediaSalario);
    }
}
