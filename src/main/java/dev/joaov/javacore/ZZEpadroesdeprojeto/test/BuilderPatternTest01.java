package dev.joaov.javacore.ZZEpadroesdeprojeto.test;

import dev.joaov.javacore.ZZEpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder.builder()
                .firstName("joao")
                .lastName("vitor")
                .username("jhnv")
                .email("joao@email.com")
                .build();

        System.out.println(build);
    }
}
