package dev.joaov.javacore.ZZGcrud.dominio;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Producer {
    Integer id;
    String name;
}
