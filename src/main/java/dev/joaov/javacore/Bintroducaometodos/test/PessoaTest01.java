package dev.joaov.javacore.Bintroducaometodos.test;

import dev.joaov.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "jiraya";
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        pessoa.imprime();

    }
}
