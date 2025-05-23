package dev.joaov.javacore.ZZFjdbc.test;

import dev.joaov.javacore.ZZFjdbc.dominio.Producer;
import dev.joaov.javacore.ZZFjdbc.service.ProducerService;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest {
    public static void main(String[] args) {
//        Producer producer = Producer.builder().name("Toei Animation").build();
//        Producer producerToUpdate = Producer.builder().id(2).name("MadHouse").build();
//        ProducerService.save(producer);
//        ProducerService.delete(8);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found: '{}'", producers);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Toei");
        log.info("Producers found '{}'", producers);
    }
}
