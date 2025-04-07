package dev.joaov.javacore.Oexceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {
        try {
            criarNovoArquivo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("/home/joao/Documents/Java/devdojo-java/arquivo/test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+ isCriado);
        } catch (IOException e) {
            System.out.println(e);
            throw e;
        }
    }
}
