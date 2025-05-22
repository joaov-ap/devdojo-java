package dev.joaov.javacore.Npolimorfismo.test;

import dev.joaov.javacore.Npolimorfismo.repositorio.Repositorio;
import dev.joaov.javacore.Npolimorfismo.servico.RepositorioArquivo;
import dev.joaov.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import dev.joaov.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
