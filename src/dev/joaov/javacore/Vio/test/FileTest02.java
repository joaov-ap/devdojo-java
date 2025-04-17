package dev.joaov.javacore.Vio.test;

import dev.joaov.javacore.Vio.dominio.Pessoa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();

        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        for (int i = 0; i < 7; i++) {
            File arquivo = new File(fileDiretorio, "arquivo"+(i+1)+".txt");
            arquivo.createNewFile();
        }
        String[] list = fileDiretorio.list((file, s) -> s.endsWith(".bkp"));

        for (String raw : list) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader("pasta/"+raw))) {
                String nome = bufferedReader.readLine();
                String idade = bufferedReader.readLine();
                pessoas.add(new Pessoa(nome, idade));

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        pessoas.forEach(System.out::println);

//        System.out.println("Pasta criada? "+ isDiretorioCreated);
//        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
//        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
//        System.out.println("arquivo.txt criado? "+isFileCreated);
//
//        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
//        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
//        System.out.println("arquivo.txt renomeado "+isRenamed);
//
//        File diretorioRenamed = new File("pasta2");
//        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
//        System.out.println("Diretorio pasta renomeado? "+isDiretorioRenomeado);
    }
}
