package dev.joaov.javacore.Oexceptions.exception.test;

import dev.joaov.javacore.Oexceptions.exception.dominio.Funcionario;
import dev.joaov.javacore.Oexceptions.exception.dominio.LoginInvalidoException;
import dev.joaov.javacore.Oexceptions.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
