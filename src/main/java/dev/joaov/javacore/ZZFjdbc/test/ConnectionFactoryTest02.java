package dev.joaov.javacore.ZZFjdbc.test;

import dev.joaov.javacore.ZZFjdbc.dominio.Producer;
import dev.joaov.javacore.ZZFjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("N").build();
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);
//        log.info("----------------------------------");
//        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
//        log.info(producers);
    }
}
