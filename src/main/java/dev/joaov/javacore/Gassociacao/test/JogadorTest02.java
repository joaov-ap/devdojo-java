package dev.joaov.javacore.Gassociacao.test;

import dev.joaov.javacore.Gassociacao.dominio.Jogador;
import dev.joaov.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
