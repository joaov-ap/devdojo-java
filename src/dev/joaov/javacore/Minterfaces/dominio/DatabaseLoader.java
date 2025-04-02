package dev.joaov.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de dados.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Banco de dados.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados.");
    }
}
