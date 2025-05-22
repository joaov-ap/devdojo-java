package dev.joaov.javacore.Gassociacao.test;

import dev.joaov.javacore.Gassociacao.dominio.Aluno;
import dev.joaov.javacore.Gassociacao.dominio.Local;
import dev.joaov.javacore.Gassociacao.dominio.Professor;
import dev.joaov.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local endereco = new Local("Rua do Youtube");
        Seminario seminario = new Seminario("Aula DevDojo", endereco);
        Aluno aluno = new Aluno("Joao", 22, seminario);
        Seminario[] seminarios = {seminario};
        Aluno[] alunos = {aluno};
        seminario.setAlunos(alunos);
        Professor professor = new Professor("William", "Java", seminarios);

        System.out.println("------------- Seminario -------------");
        System.out.println(seminario.getTitulo());
        System.out.println(seminario.getEndereco().getEndereco());
        System.out.println("---------- Alunos ----------");
        for (Aluno aluno1 : seminario.getAlunos()) {
            System.out.println(aluno1.getNome());
        }
        System.out.println("---------- Professores ----------");
        System.out.println(professor.getNome());
        System.out.println(professor.getEspecialidade());


    }
}
