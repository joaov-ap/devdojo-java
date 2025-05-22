package dev.joaov.javacore.Ygenerics.test;

import dev.joaov.javacore.Ygenerics.dominio.Barco;
import dev.joaov.javacore.Ygenerics.service.BarcoRentavelService;

public class ClasseGericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
