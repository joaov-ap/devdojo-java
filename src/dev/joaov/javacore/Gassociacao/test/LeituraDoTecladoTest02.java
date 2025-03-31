package dev.joaov.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("-------- Programa que preve o futuro --------");
        System.out.println("-- Digite sua pergunta e responderei 'SIM'ou 'NAO' --");
        System.out.println("---------------------------------------------");

        String[] respostas = {"SIM", "NÃO", "SIM", "NÃO", "SIM", "NÃO", "SIM", "NÃO", "SIM", "NÃO", "SIM", "NÃO"};
        String pergunta = input.nextLine();

        while (!pergunta.equals(" ")) {
            int numeroAleatorio = (int) Math.floor((Math.random() * (respostas.length - 1)) + 1);
            System.out.println(respostas[numeroAleatorio]);
            pergunta = input.nextLine();
        }
    }
}
