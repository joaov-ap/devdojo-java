package dev.joaov.javacore.ZZHjunit.test;

import dev.joaov.javacore.ZZHjunit.dominio.Person;
import dev.joaov.javacore.ZZHjunit.service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonServiceTest01 {
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        log.info("Is Adult? '{}'", personService.isAdult(person));
    }
}
