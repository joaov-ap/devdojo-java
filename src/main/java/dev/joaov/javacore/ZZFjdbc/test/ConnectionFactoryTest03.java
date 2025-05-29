package dev.joaov.javacore.ZZFjdbc.test;

import dev.joaov.javacore.ZZFjdbc.dominio.Producer;
import dev.joaov.javacore.ZZFjdbc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Production I.G").build();
        Producer producer2 = Producer.builder().name("White fox").build();
        Producer producer3 = Producer.builder().name("Cloverworks").build();
        ProducerService.saveTransaction(List.of(producer1, producer2, producer3));
    }
}
