package dev.joaov.javacore.Hheranca.test;

import dev.joaov.javacore.Hheranca.dominio.Endereco;
import dev.joaov.javacore.Hheranca.dominio.Funcionario;
import dev.joaov.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua do Limoeiro");
        endereco.setCep("01234-567");

        Pessoa pessoa = new Pessoa("Will", "12345678901", endereco);
        pessoa.imprime();

        System.out.println("----------------------------");
        Funcionario funcionario = new Funcionario("Gon Freecs", "01987654321", endereco, 20000);
        funcionario.imprime();
    }
}
