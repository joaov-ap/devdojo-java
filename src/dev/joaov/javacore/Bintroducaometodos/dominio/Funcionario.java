package dev.joaov.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void imprimeDadosFuncionario() {
        System.out.println("--------- Dados do Funcionário ---------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salarios:");
        for (double v : this.salarios) {
            System.out.print(v + " ");
        }
    }

    public double mediaSalario() {
        double somaSalarios = 0;

        for (double v : salarios) {
            somaSalarios += v;
        }

        return somaSalarios / 3;
    }
}
