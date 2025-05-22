package dev.joaov.javacore.Oexceptions.exception.test;

import dev.joaov.javacore.Oexceptions.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner input = new Scanner(System.in);
        String usernameDB = "Gon";
        String passwordDB = "1234";
        System.out.print("Usuario: ");
        String username = input.nextLine();
        System.out.print("Senha: ");
        String password = input.nextLine();

        if (!usernameDB.equals(username) || !passwordDB.equals(password)) {
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        }

        System.out.println("Usuario Logado com sucesso.");
    }
}
