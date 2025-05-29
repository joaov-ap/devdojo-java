package dev.joaov.javacore.ZZFjdbc.test;

import dev.joaov.javacore.ZZFjdbc.dominio.Producer;
import dev.joaov.javacore.ZZFjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("NHK").build();
        Producer producerToUpdate = Producer.builder().id(3).name("A-1 Pictures").build();
//        ProducerService.save(producer);
//        ProducerService.delete(12);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found: '{}'", producers);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Toei");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("Toei Animations");
//        log.info("Producers found '{}'", producers);
//        ProducerService.findByNameAndDelete("Toei Animations");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("Studio");
//        log.info("Producers found '{}'", producers);
//        ProducerService.updatePreparedStatement(producerToUpdate);
//        List<Producer> producers = ProducerService.findByNameCallableStatement("NHK");
//        log.info("Producers found '{}'", producers);

    }
}
