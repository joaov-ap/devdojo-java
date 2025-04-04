package dev.joaov.javacore.Oexceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        createNewFile();
    }

    private static void createNewFile() {
        File file = new File("/home/joao/Documents/Java/devdojo-java/arquivo/teste.txt");
        try {
            boolean isCreated = file.createNewFile();

            System.out.println("File created? "+isCreated);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
